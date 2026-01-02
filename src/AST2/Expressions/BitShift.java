package AST2.Expressions;

import AST2.Expr;

public class BitShift extends Expr {
    private final Expr left;
    private final Expr right;
    private final boolean isRight;
    public BitShift(int line,Expr left,Expr right, boolean isRight) {
        super(line,"Bit Shift Expression");
        this.left=left;
        this.right=right;
        this.isRight = isRight;
    }
    public Expr getLeft() {
        return left;
    }
    public Expr getRight() {
        return right;
    }

    public boolean isRight() {
        return isRight;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (left != null) {
            sb.append(left.print(indentation)).append("\n");
        }
        if (right != null) {
            sb.append(right.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}
