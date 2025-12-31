package AST2.Expressions;

import AST2.Expr;

public class UnaryExpr extends Expr {
    private final String unaryOperator;
    private final Expr expression;
    public UnaryExpr(int line, String unaryOperator, Expr expression1) {
        super(line,"Unary Expression");
        this.unaryOperator = unaryOperator;
        this.expression = expression1;
    }
    public String getUnaryOperator() {
        return unaryOperator;
    }
    public Expr getExpression() {
        return expression;
    }
}
