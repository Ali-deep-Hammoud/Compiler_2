package AST2.compound_statement;

import AST2.CompoundStatement;
import AST2.Expr;
import AST2.Statement;

import java.util.ArrayList;
import java.util.List;

public class ForStatement extends CompoundStatement {
    private final List<Expr> targets;
    private final Expr Iterator;
    private final List<Statement> forBody;
    private final List<Statement> elseBody;

    public ForStatement(int line, Expr iterator) {
        super(line, "For Statement");
        this.Iterator = iterator;
        this.targets = new ArrayList<>();
        this.forBody = new ArrayList<>();
        this.elseBody = new ArrayList<>();
    }

    public void addForBodyStatement(Statement statement) {
        this.forBody.add(statement);
    }
    public void addElseBodyStatement(Statement statement) {
        this.elseBody.add(statement);
    }
    public void addTarget(Expr expr) {
        this.targets.add(expr);
    }

    public void removeForBodyStatement(Statement statement) {
        this.forBody.remove(statement);
    }
    public void removeElseBodyStatement(Statement statement) {
        this.elseBody.remove(statement);
    }
    public void removeTarget(Expr expr) {
        this.targets.remove(expr);
    }

    public List<Expr> getTargets() {
        return targets;
    }

    public List<Statement> getElseBody() {
        return elseBody;
    }

    public List<Statement> getForBody() {
        return forBody;
    }

    public Expr getIterator() {
        return Iterator;
    }
}
