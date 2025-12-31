package AST2.compound_statement;

import AST2.Expr;
import AST2.Node;
import AST2.Statement;

import java.util.ArrayList;
import java.util.List;

public class ElifStatement extends Node {
    private final Expr condition;
    private final Body body;
    public ElifStatement(int line,Expr condition,Body body) {
        super(line,"Elif Statement");
        this.condition = condition;
        this.body = body;
    }
    public Body getBody() {
        return body;
    }

    public Expr getCondition() {
        return condition;
    }
}
