package AST2.Expressions;

import AST2.Expr;

import java.util.List;

public class CallExpr extends Expr {
    private final Expr callee;
    private final List<Expr> args;
    public CallExpr(int line, Expr callee, List<Expr> args) {
        super(line, "CallExpr");
        this.callee = callee;
        this.args = args;
    }
    public Expr getCallee() {
        return callee;
    }
}

