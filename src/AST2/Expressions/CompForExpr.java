package AST2.Expressions;

import AST2.Expr;

import java.util.List;

public class CompForExpr extends Expr {
    private final Expr targets;
    private final Expr iterable;
    private final Expr loop;

    public CompForExpr(int line, Expr targets, Expr iterable, Expr loop) {
        super(line, "Comp For Expression");
        this.targets = targets;
        this.iterable = iterable;
        this.loop = loop;
    }

    public Expr getTargets() { return targets; }
    public Expr getIterable() { return iterable; }
    public Expr getLoop() {
        return loop;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (targets != null) {
            sb.append(targets.print(indentation)).append("\n");
        }
        if (iterable != null) {
            sb.append(iterable.print(indentation)).append("\n");
        }
        if (loop != null) {
            sb.append(loop.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}
