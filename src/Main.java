import AST.Attribute;
import AST.Program;
import Visitor.JinjaHtmlVisitor;
import Visitor.PythonVisitor;
import antlr.JinjaHtmlLexer;
import antlr.JinjaHtmlParser;
import antlr.PythonLexer;
import antlr.PythonParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        String source = "Tests/test1.txt";
        CharStream input = CharStreams.fromFileName(source);
        JinjaHtmlLexer lexer = new JinjaHtmlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JinjaHtmlParser parser = new JinjaHtmlParser(tokens);
        ParseTree ast = parser.prog();
        JinjaHtmlVisitor visitor = new JinjaHtmlVisitor();
        Program program = (Program) visitor.visit(ast);
        System.out.println(program);
         /*
        String source = "Tests/test.txt";
        CharStream input = CharStreams.fromFileName(source);
        PythonLexer lexer = new PythonLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonParser parser = new PythonParser(tokens);
        ParseTree ast = parser.file_input();
        PythonVisitor visitor = new PythonVisitor();
        AST2.Program program = (AST2.Program) visitor.visit(ast);
        System.out.println(program.print(""));

          */
    }
}