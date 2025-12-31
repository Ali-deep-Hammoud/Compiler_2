package AST2.compound_statement;

import AST2.Node;
import AST2.Statement;

import java.util.ArrayList;
import java.util.List;

public class Body extends Node {
    private final List<Statement> statements;

    public Body(int line, String name) {
        super(line, "Body");
        statements = new ArrayList<>();
    }
    public void addStatement(Statement statement) {
        statements.add(statement);
    }
    public void removeStatement(Statement statement) {
        statements.remove(statement);
    }
    public List<Statement> getStatements() {
        return statements;
    }
}
