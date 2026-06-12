import AST.Program;
import CodeGen.HtmlIRGenerator;
import CodeGen.PythonIRGenerator;
import CodeGen.TargetCodeEmitter;
import IR.IRProgram;
import Symbol_Table.DiagnosticCollector;
import Symbol_Table.HtmlSymbolTable;
import Symbol_Table.SymbolTable;
import Visitor.CustomErrorListener;
import Visitor.HtmlSemanticAnalyzer;
import Visitor.JinjaHtmlVisitor;
import Visitor.JinjaPythonResolver;
import Visitor.PythonAstRepair;
import Visitor.PythonSemanticAnalyzer;
import Visitor.PythonVisitor;
import antlr.JinjaHtmlLexer;
import antlr.JinjaHtmlParser;
import antlr.PythonLexer;
import antlr.PythonParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        String htmlSource = "Tests/test1.txt";
        String pythonSource = "Tests/test.txt";

        DiagnosticCollector diagnostics = new DiagnosticCollector();

        // ── Phase 1: Parse ──────────────────────────────────────────────
        Program htmlProgram = parseHtml(htmlSource, diagnostics);
        System.out.println("=== HTML/Jinja AST ===");
        System.out.println(htmlProgram);

        AST2.Program pythonProgram = parsePython(pythonSource, diagnostics);
        PythonAstRepair.repair(pythonProgram);
        System.out.println("=== Python AST ===");
        System.out.println(pythonProgram.print(""));

        // ── Phase 2: Semantic Analysis ──────────────────────────────────
        HtmlSemanticAnalyzer htmlSemantic = new HtmlSemanticAnalyzer(htmlSource, diagnostics);
        HtmlSymbolTable htmlTable = htmlSemantic.analyze(htmlProgram);
        printHtmlSymbolTable(htmlTable);

        PythonSemanticAnalyzer pySemantic = new PythonSemanticAnalyzer(
                diagnostics.getSemanticErrors(), pythonSource);
        SymbolTable symbolTable = pySemantic.analyze(pythonProgram);
        System.out.println(symbolTable.printSymbolTable());

        new JinjaPythonResolver(symbolTable, diagnostics.getSemanticErrors(), htmlSource)
                .resolve(htmlProgram);

        System.out.println("=== Diagnostics (" + diagnostics.errorCount() + ") ===");
        diagnostics.printAll();

        if (diagnostics.hasErrors()) {
            System.out.println("\nCompilation aborted: fix semantic/syntax errors before code generation.");
            return;
        }

        // ── Phase 3: Intermediate Code Generation ───────────────────────
        IRProgram pythonIr = new PythonIRGenerator().generate(pythonProgram, symbolTable);
        IRProgram htmlIr = new HtmlIRGenerator().generate(htmlProgram);

        System.out.println("\n=== Python IR ===");
        System.out.println(pythonIr.print());

        System.out.println("=== HTML IR ===");
        System.out.println(htmlIr.print());

        // ── Phase 4: Target Code Generation ─────────────────────────────
        TargetCodeEmitter emitter = new TargetCodeEmitter();
        String pythonTarget = emitter.emitPython(pythonIr);
        String htmlTarget = emitter.emitHtml(htmlIr);

        System.out.println("=== Generated Python (target) ===");
        System.out.println(pythonTarget);

        System.out.println("=== Generated HTML (target) ===");
        System.out.println(htmlTarget);

        Path outDir = Path.of("Tests", "output");
        Files.createDirectories(outDir);
        Files.writeString(outDir.resolve("generated.py"), pythonTarget);
        Files.writeString(outDir.resolve("generated.html"), htmlTarget);
        System.out.println("\nTarget files written to Tests/output/");
    }

    private static Program parseHtml(String sourcePath, DiagnosticCollector diagnostics) throws IOException {
        CharStream input = CharStreams.fromFileName(sourcePath);
        JinjaHtmlLexer lexer = new JinjaHtmlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JinjaHtmlParser parser = new JinjaHtmlParser(tokens);
        attachErrorListener(parser, diagnostics, sourcePath);
        ParseTree tree = parser.prog();
        return (Program) new JinjaHtmlVisitor().visit(tree);
    }

    private static AST2.Program parsePython(String sourcePath, DiagnosticCollector diagnostics) throws IOException {
        CharStream input = CharStreams.fromFileName(sourcePath);
        PythonLexer lexer = new PythonLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonParser parser = new PythonParser(tokens);
        attachErrorListener(parser, diagnostics, sourcePath);
        ParseTree tree = parser.file_input();
        return (AST2.Program) new PythonVisitor().visit(tree);
    }

    private static void attachErrorListener(org.antlr.v4.runtime.Parser parser,
                                            DiagnosticCollector diagnostics,
                                            String sourcePath) {
        parser.removeErrorListeners();
        parser.addErrorListener(new CustomErrorListener(diagnostics.getSyntaxReporter(), sourcePath));
    }

    private static void printHtmlSymbolTable(HtmlSymbolTable table) {
        System.out.println("=== HTML/Jinja Symbol Table ===");
        printHtmlTags(table);
        printHtmlIds(table);
        printHtmlClasses(table);
        printHtmlAttributes(table);
        if (!table.jinjaVariables.isEmpty()) {
            System.out.println("\nJinja Variables:");
            for (String v : table.jinjaVariables) {
                System.out.println("  " + v);
            }
        }
    }

    private static void printHtmlTags(HtmlSymbolTable table) {
        System.out.println("\nTags:");
        if (table.tags.isEmpty()) {
            System.out.println("  (no tags found)");
            return;
        }
        System.out.printf("  %-30s %-15s %-6s %s%n", "Key", "TagName", "Line", "Attributes");
        System.out.println("  " + "-".repeat(80));
        for (var entry : table.tags.entrySet()) {
            String attrs = entry.getValue().attributes.isEmpty() ? "{}" : entry.getValue().attributes.toString();
            System.out.printf("  %-30s %-15s %-6d %s%n",
                    entry.getKey(),
                    entry.getValue().tagName,
                    entry.getValue().line,
                    attrs);
        }
    }

    private static void printHtmlIds(HtmlSymbolTable table) {
        System.out.println("\nIDs:");
        if (table.ids.isEmpty()) {
            System.out.println("  (no ids found)");
            return;
        }
        System.out.printf("  %-20s %-15s %-6s%n", "ID", "OwnerTag", "Line");
        System.out.println("  " + "-".repeat(45));
        for (var entry : table.ids.entrySet()) {
            System.out.printf("  %-20s %-15s %-6d%n",
                    entry.getKey(),
                    entry.getValue().ownerTag,
                    entry.getValue().line);
        }
    }

    private static void printHtmlClasses(HtmlSymbolTable table) {
        System.out.println("\nClasses:");
        if (table.classes.isEmpty()) {
            System.out.println("  (no classes found)");
            return;
        }
        System.out.printf("  %-20s %s%n", "Class", "Tags");
        System.out.println("  " + "-".repeat(60));
        for (var entry : table.classes.entrySet()) {
            String tags = entry.getValue().stream()
                    .map(tag -> tag.key())
                    .reduce((a, b) -> a + ", " + b)
                    .orElse("");
            System.out.printf("  %-20s %s%n", entry.getKey(), tags);
        }
    }

    private static void printHtmlAttributes(HtmlSymbolTable table) {
        System.out.println("\nAttributes:");
        if (table.attributes.isEmpty()) {
            System.out.println("  (no attributes found)");
            return;
        }
        System.out.printf("  %-4s %-15s %-50s %-6s%n", "#", "Name", "Value", "Line");
        System.out.println("  " + "-".repeat(80));
        for (int i = 0; i < table.attributes.size(); i++) {
            var attr = table.attributes.get(i);
            System.out.printf("  %-4d %-15s %-50s %-6d%n",
                    i,
                    attr.name,
                    attr.value,
                    attr.line);
        }
    }
}
