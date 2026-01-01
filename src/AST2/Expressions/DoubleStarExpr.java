package AST2.Expressions;

import AST2.Expr;

public class DoubleStarExpr extends Expr {
    private final Expr expr;
    public DoubleStarExpr(int line, Expr expr) {
        super(line,"Double Star Expression");
        this.expr = expr;
    }
    public Expr getExpr() {
        return expr;
    }
}
