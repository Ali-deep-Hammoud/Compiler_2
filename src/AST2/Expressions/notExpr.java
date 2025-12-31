package AST2.Expressions;

import AST2.Expr;

public class notExpr extends Expr {
    private final Expr expression;
    public notExpr(int line,Expr expression) {
        super(line,"Not Expression");
        this.expression = expression;
    }
    public Expr getExpression() {
        return expression;
    }
}
