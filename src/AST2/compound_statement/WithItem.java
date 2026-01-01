package AST2.compound_statement;

import AST2.Expr;
import AST2.Node;

public class WithItem extends Node {
    private final Expr context;
    private final Expr target;

    public WithItem(int line,Expr context, Expr target) {
        super(line,"With Item");
        this.context = context;
        this.target = target;
    }

    public Expr getTarget() {
        return target;
    }

    public Expr getContext() {
        return context;
    }
}
