package AST2.compound_statement;

import AST2.CompoundStatement;
import AST2.Expr;
import AST2.Statement;

import java.util.ArrayList;
import java.util.List;

public class IfStatement extends CompoundStatement {
    private final Expr condition;
    private final Body ifBody;
    private final List<ElifStatement> elifStatements;
    private final Body elseBody;

    public IfStatement(int line, Expr condition,Body ifBody,Body elseBody) {
        super(line, "If Statement");
        this.condition = condition;
        this.ifBody = ifBody;
        this.elifStatements = new ArrayList<>();
        this.elseBody = elseBody;
    }

    public void addElifStatement(ElifStatement statement) {
        this.elifStatements.add(statement);
    }

    public void removeElifStatement(ElifStatement statement) {
        this.elifStatements.remove(statement);
    }

    public Expr getCondition() {
        return condition;
    }

    public Body getIfBody() {
        return ifBody;
    }

    public List<ElifStatement> getElifStatements() {
        return elifStatements;
    }

    public Body getElseBody() {
        return elseBody;
    }
}
