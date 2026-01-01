package AST2.Expressions;

import AST2.Expr;

public class CompIfExpr extends Expr {
    private final Expr expr;
    private final Expr loop;

    public CompIfExpr(int line,Expr expr, Expr loop) {
        super(line,"Comp If Expression");
        this.expr = expr;
        this.loop = loop;
    }

    public Expr getLoop() {
        return loop;
    }

    public Expr getExpr() {
        return expr;
    }
}
