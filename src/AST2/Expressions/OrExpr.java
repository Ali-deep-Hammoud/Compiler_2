package AST2.Expressions;

import AST2.Expr;

import java.util.ArrayList;
import java.util.List;

public class OrExpr extends Expr {
    private final Expr left;
    private final Expr right;
    public OrExpr(int line,Expr left,Expr right) {
        super(line,"Or Expression");
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
