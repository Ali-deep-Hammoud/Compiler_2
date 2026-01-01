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
}
