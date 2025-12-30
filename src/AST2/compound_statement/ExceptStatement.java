package AST2.compound_statement;

import AST2.Expr;
import AST2.Node;
import AST2.Statement;

import java.util.ArrayList;
import java.util.List;

public class ExceptStatement extends Node {
    private final Expr type;
    private final String name;
    private final List<Statement> body;

    public ExceptStatement(int line,Expr type, String name) {
        super(line,"Except Statement");
        this.type = type;
        this.name = name;
        this.body = new ArrayList<>();
    }
    public void addBodyStatement(Statement statement) {
        this.body.add(statement);
    }
    public void removeBodyStatement(Statement statement) {
        this.body.remove(statement);
    }
    public List<Statement> getBody() {
        return body;
    }
    public Expr getType() {
        return type;
    }
    public String getName() {
        return name;
    }
}
