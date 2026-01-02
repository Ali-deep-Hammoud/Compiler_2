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
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (target != null) {
            sb.append(target.print(indentation)).append("\n");
        }
        if (index != null) {
            sb.append(index.print(indentation)).append("\n");
        }

        sb.append(indent).append("}");
        return sb.toString();
    }
}
