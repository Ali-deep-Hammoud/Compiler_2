package AST2.compound_statement;

import AST2.CompoundStatement;
import AST2.Expr;
import AST2.Statement;

import java.util.ArrayList;
import java.util.List;

public class ForStatement extends CompoundStatement {
    private final List<Expr> targets;
    private final Expr Iterator;
    private final Body forBody;
    private final Body elseBody;

    public ForStatement(int line, Expr iterator, Body forBody, Body elseBody) {
        super(line, "For Statement");
        this.Iterator = iterator;
        this.targets = new ArrayList<>();
        this.forBody = forBody;
        this.elseBody = elseBody;
    }


    public void addTarget(Expr expr) {
        this.targets.add(expr);
    }


    public void removeTarget(Expr expr) {
        this.targets.remove(expr);
    }

    public List<Expr> getTargets() {
        return targets;
    }

    public Body getElseBody() {
        return elseBody;
    }

    public Body getForBody() {
        return forBody;
    }

    public Expr getIterator() {
        return Iterator;
    }
}
