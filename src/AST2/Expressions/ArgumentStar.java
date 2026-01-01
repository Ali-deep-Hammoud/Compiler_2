package AST2.Expressions;

import AST2.Expr;

public class ArgumentStar extends Argument{
    private final Expr  expr;
    public ArgumentStar(int line ,Expr expr){
        super(line,"Star Argument");
        this.expr = expr;
    }
    public Expr getExpr() {
        return expr;
    }
}
