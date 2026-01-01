package AST2.Expressions.Atoms;

import AST2.Expr;

public class DictUnpack extends DictElement{
    private final Expr expr;
    public DictUnpack(int line ,Expr expr) {
        super(line, "Dict Unpack");
        this.expr = expr;
    }
    public Expr getExpr() {
        return expr;
    }
}
