package AST2.Expressions;

import AST2.Expr;

public class ComparisonExpr extends Expr {
    private final Expr left;
    private final String  op;
    private final Expr right;

    public ComparisonExpr(int line,Expr left, String op, Expr right) {
        super(line,"Comparison Expression");
        this.left = left;
        this.op = op;
        this.right = right;
    }
    public Expr getLeft() {
        return left;
    }
    public String getOp() {
        return op;
    }
    public Expr getRight() {
        return right;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (left != null) {
            sb.append(left.print(indentation)).append("\n");
        }
        if(op != null){
            sb.append(indentation).append("operator: ").append(op).append("\n");
        }
        if (right != null) {
            sb.append(right.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}
