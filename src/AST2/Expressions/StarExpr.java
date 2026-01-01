package AST2.Expressions;

import AST2.Expr;

public class StarExpr extends Expr {
    private final Expr expr;

    public StarExpr(int line, Expr expr) {
        super(line, "Star Expression");
        this.expr = expr;
    }

    public Expr getName() {
        return expr;
    }
}
