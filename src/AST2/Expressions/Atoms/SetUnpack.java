package AST2.Expressions.Atoms;

import AST2.Expr;

public class SetUnpack extends SetElement{
    private final Expr expr;
    public SetUnpack(int line,Expr expr) {
        super(line,"Set Unpack");
        this.expr = expr;
    }
    public Expr getExpr() {
        return expr;
    }
}
