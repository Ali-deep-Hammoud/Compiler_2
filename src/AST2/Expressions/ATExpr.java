package AST2.Expressions;

import AST2.Expr;

public class ATExpr extends Expr {
    private final Expr left;
    private final Expr right;
    public ATExpr(int line,Expr left,Expr right) {
        super(line,"AT Expression");
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
