package AST2.Expressions;

import AST2.Expr;

public class ArgumentDoubleStar extends Argument{
    private final Expr  expr;
    public ArgumentDoubleStar(int line ,Expr expr) {
        super(line,"Double star Argument");
        this.expr=expr;
    }
    public Expr getExpr() {
        return expr;
    }
}
