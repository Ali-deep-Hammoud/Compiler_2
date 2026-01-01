package AST2.Expressions;

import AST2.Expr;

public class PowerExpr extends Expr {

    private final Expr base;
    private final Expr exponent;

    public PowerExpr(int line, Expr base, Expr exponent) {
        super(line, "Power Expression");
        this.base = base;
        this.exponent = exponent;
    }

    public Expr getBase() { return base; }
    public Expr getExponent() { return exponent; }
}

