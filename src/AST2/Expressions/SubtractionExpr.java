package AST2.Expressions;

import AST2.Expr;

public class SubtractionExpr extends Expr {
    private final Expr left;
    private final Expr right;
    public SubtractionExpr(int line,Expr left,Expr right) {
        super(line,"Subtraction Expression");
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
