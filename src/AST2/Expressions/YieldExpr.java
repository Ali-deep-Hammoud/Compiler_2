package AST2.Expressions;

import AST2.Expr;

public class YieldExpr extends Expr {
    private final Expr expr;
    public YieldExpr(int line ,Expr expr) {
        super(line,"Yield Expression");
        this.expr = expr;
    }
    public Expr getExpr() {
        return expr;
    }
}
