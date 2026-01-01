package AST2.Expressions;

import AST2.Expr;


public class MultiplyExpr extends Expr {
    private final Expr left;
    private final Expr right;
    public MultiplyExpr(int line, Expr left, Expr right) {
        super(line,"Multiply Expression");
        this.left=left;
        this.right=right;
    }
    public Expr getLeft() {
        return left;
    }
    public Expr getRight() {
        return right;
    }
}
