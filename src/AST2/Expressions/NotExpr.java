package AST2.Expressions;

import AST2.Expr;

public class NotExpr extends Expr {
    private final Expr expression;
    public NotExpr(int line, Expr expression) {
        super(line,"Not Expression");
        this.expression = expression;
    }
    public Expr getExpression() {
        return expression;
    }
}
