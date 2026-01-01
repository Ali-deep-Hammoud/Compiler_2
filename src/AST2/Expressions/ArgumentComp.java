package AST2.Expressions;

import AST2.Expr;

public class ArgumentComp extends Argument{
    private final Expr expr;
    private final CompForExpr comp;
    public ArgumentComp(int line,Expr expr, CompForExpr comp) {
        super(line,"Argument Comp");
        this.expr = expr;
        this.comp = comp;
    }
    public Expr getExpr() {
        return expr;
    }
    public CompForExpr getComp() {
        return comp;
    }

}
