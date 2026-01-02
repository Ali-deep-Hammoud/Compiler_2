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
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (expr != null) {
            sb.append(expr.print(indentation)).append("\n");
        }

        sb.append(indent).append("}");
        return sb.toString();
    }
}
