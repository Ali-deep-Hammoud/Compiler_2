package AST2.Expressions;

import AST2.Expr;
import Visitor.PythonVisitor;

public class AdditionExpr extends Expr{
    private final Expr left;
    private final Expr right;
    public AdditionExpr(int line,Expr left,Expr right) {
        super(line,"Addition Expression");
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
