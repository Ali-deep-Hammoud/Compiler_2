package AST2.compound_statement;

import AST2.Node;
import AST2.Statement;

import java.util.ArrayList;
import java.util.List;

public class Body extends Node {
    private final List<Statement> statements;

    public Body(int line) {
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
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (!statements.isEmpty()) {
            for (Statement statement : statements) {
                sb.append(statement.print(indentation)).append("\n");
            }
        }

        sb.append(indent).append("}");
        return sb.toString();
    }

}
