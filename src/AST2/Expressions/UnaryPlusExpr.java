package AST2.Expressions;

import AST2.Expr;

public class UnaryPlusExpr extends Expr {
    private final Expr expression;
    public UnaryPlusExpr(int line, Expr expression1) {
        super(line,"Unary Plus Expression");
        this.expression = expression1;
    }

    public Expr getExpression() {
        return expression;
    }
}
