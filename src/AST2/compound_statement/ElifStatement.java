package AST2.compound_statement;

import AST2.Expr;
import AST2.Node;
import AST2.Statement;

import java.util.ArrayList;
import java.util.List;

public class ElifStatement extends Node {
    private final Expr condition;
    private final List<Statement> body;
    public ElifStatement(int line,Expr condition) {
        super(line,"Elif Statement");
        this.condition = condition;
        this.body = new ArrayList<>();
    }
    public void addStatement(Statement statement) {
        body.add(statement);
    }
    public void removeStatement(Statement statement) {
        body.remove(statement);
    }
    public List<Statement> getBody() {
        return body;
    }

    public Expr getCondition() {
        return condition;
    }
}
