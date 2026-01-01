package AST2.Expressions;

import AST2.Expr;

public class IndexExpr extends Expr {
    private final Expr target;
    private final Expr index;
    public IndexExpr(int line, Expr target, Expr index) {
        super(line, "IndexExpr");
        this.target = target;
        this.index = index;
    }

    public Expr getTarget() {
        return target;
    }
    public Expr getIndex() {
        return index;
    }
}
