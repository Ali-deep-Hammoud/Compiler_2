package AST2.Expressions;

import AST2.Expr;

public class UnaryMinusExpr extends Expr {
    private final Expr expression;
    public UnaryMinusExpr(int line, Expr expression1) {
        super(line,"Unary Minus Expression");
        this.expression = expression1;
    }

    public Expr getExpression() {
        return expression;
    }
}
