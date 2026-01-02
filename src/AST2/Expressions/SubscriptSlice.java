package AST2.Expressions;

import AST2.Expr;

public class SubscriptSlice extends Subscript {
    private final Expr start;
    private final Expr end;
    private final Expr steps;
    public SubscriptSlice(int line,Expr start, Expr end, Expr steps) {
        super(line,"Slice SubScript");
        this.start = start;
        this.end = end;
        this.steps = steps;
    }
    public Expr getStart() {
        return start;
    }
    public Expr getEnd() {
        return end;
    }
    public Expr getSteps() {
        return steps;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (start != null) {
            sb.append(start.print(indentation)).append("\n");
        }
        if (end != null) {
            sb.append(end.print(indentation)).append("\n");
        }
        if (steps != null) {
            sb.append(steps.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}
