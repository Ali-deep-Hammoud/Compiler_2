package AST2.Expressions;

import AST2.Expr;

public class UnaryTildeExpr extends Expr {
    private final Expr expression;
    public UnaryTildeExpr(int line, Expr expression1) {
        super(line,"Unary Tilde Expression");
        this.expression = expression1;
    }

    public Expr getExpression() {
        return expression;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (expression != null) {
            sb.append(expression.print(indentation)).append("\n");
        }

        sb.append(indent).append("}");
        return sb.toString();
    }
}
