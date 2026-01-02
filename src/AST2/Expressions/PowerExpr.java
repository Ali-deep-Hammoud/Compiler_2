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
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (base != null) {
            sb.append(exponent.print(indentation)).append("\n");
        }
        if (base != null) {
            sb.append(exponent.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}

