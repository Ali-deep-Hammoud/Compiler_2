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
