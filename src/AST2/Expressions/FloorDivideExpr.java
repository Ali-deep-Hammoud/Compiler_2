package AST2.Expressions;

import AST2.Expr;

public class FloorDivideExpr extends Expr {
    private final Expr left;
    private final Expr right;
    public FloorDivideExpr(int line,Expr left,Expr right) {
        super(line,"Floor Divide Expression");
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
