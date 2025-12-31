package AST2.Expressions;

import AST2.Expr;

public class Ifexpr extends Expr {
    private final Expr condition;
    private final Expr thenExpression;
    private final Expr elseExpression;

    public Ifexpr(int line,Expr condition, Expr thenExpression, Expr elseExpression) {
        super(line,"If expression");
        this.condition = condition;
        this.thenExpression = thenExpression;
        this.elseExpression = elseExpression;
    }

    public Expr getCondition() {
        return condition;
    }

    public Expr getThenExpression() {
        return thenExpression;
    }

    public Expr getElseExpression() {
        return elseExpression;
    }
}
