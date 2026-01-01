package AST2.Expressions;

import AST2.Expr;

public class DivideExpr extends Expr {
    private final Expr left;
    private final Expr right;
    public DivideExpr(int line,Expr left,Expr right) {
        super(line,"Divide Expression");
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
