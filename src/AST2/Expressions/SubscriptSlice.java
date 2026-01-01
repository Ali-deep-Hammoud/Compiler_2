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
}
