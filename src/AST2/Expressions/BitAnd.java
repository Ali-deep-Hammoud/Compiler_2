package AST2.Expressions;

import AST2.Expr;

public class BitAnd extends Expr {
    private final Expr left;
    private final Expr right;
    public BitAnd(int line,Expr left,Expr right) {
        super(line,"Bit And Expression");
        this.left=left;
        this.right=right;
    }
    public Expr getLeft() {
        return left;
    }
    public Expr getRight() {
        return right;
    }
}
