package AST2.compound_statement;

import AST2.Expr;
import AST2.Node;

public class WithItem extends Node {
    private final Expr context;
    private final Expr target;

    public WithItem(int line,Expr context, Expr target) {
        super(line,"With Item");
        this.context = context;
        this.target = target;
    }

    public Expr getTarget() {
        return target;
    }

    public Expr getContext() {
        return context;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (context != null) {
            sb.append(context.print(indentation)).append("\n");
        }
        if (target != null) {
            sb.append(target.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }

}
