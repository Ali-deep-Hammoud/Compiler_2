package AST2.Expressions;

import AST2.Expr;

public class SubscriptIndex extends Subscript {
    private final Expr index;
    public SubscriptIndex(int line, Expr index) {
        super(line,"Index SubScript");
        this.index = index;
    }

    public Expr getIndex() {
        return index;
    }
}
