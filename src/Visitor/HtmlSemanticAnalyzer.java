package Visitor;

import AST.Program;
import Symbol_Table.DiagnosticCollector;
import Symbol_Table.HtmlSymbolTable;
import Symbol_Table.SemanticError;

/**
 * Semantic pass for HTML/Jinja: builds symbol table and reports structural issues.
 */
public class HtmlSemanticAnalyzer {
    private final String sourceFile;
    private final DiagnosticCollector diagnostics;

    public HtmlSemanticAnalyzer(String sourceFile, DiagnosticCollector diagnostics) {
        this.sourceFile = sourceFile;
        this.diagnostics = diagnostics;
    }

    public HtmlSymbolTable analyze(Program program) {
        HtmlSymbolTableBuilder builder = new HtmlSymbolTableBuilder();
        HtmlSymbolTable table = builder.build(program, sourceFile);
        for (SemanticError error : builder.getErrors()) {
            diagnostics.reportSemantic(error);
        }
        return table;
    }
}
