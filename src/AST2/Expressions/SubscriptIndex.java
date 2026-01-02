package AST2.Expressions;

import AST2.Expr;

public class SubscriptIndex extends Subscript {
    private final Expr index;
    public SubscriptIndex(int line, Expr index) {
        super(line,"Index SubScript");
        this.index = index;
    }

    public Expr getIndex() {
        return index;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (index != null) {
            sb.append(index.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}
