package AST2.compound_statement;

import AST2.CompoundStatement;
import AST2.Expr;
import AST2.Statement;

import java.util.ArrayList;
import java.util.List;

public class IfStatement extends CompoundStatement {
    private final Expr condition;
    private final List<Statement> ifBody;
    private final List<ElifStatement> elifStatements;
    private final List<Statement> elseBody;

    public IfStatement(int line, Expr condition) {
        super(line, "If Statement");
        this.condition = condition;
        this.ifBody = new ArrayList<>();
        this.elifStatements = new ArrayList<>();
        this.elseBody = new ArrayList<>();
    }
    public void addIfBodyStatement(Statement statement) {
        this.ifBody.add(statement);
    }
    public void addElseBodyStatement(Statement statement) {
        this.elseBody.add(statement);
    }
    public void addElifStatement(ElifStatement statement) {
        this.elifStatements.add(statement);
    }
    public void removeIfBodyStatement(Statement statement) {
        this.ifBody.remove(statement);
    }
    public void removeElseBodyStatement(Statement statement) {
        this.elseBody.remove(statement);
    }
    public void removeElifStatement(ElifStatement statement) {
        this.elifStatements.remove(statement);
    }

    public Expr getCondition() {
        return condition;
    }

    public List<Statement> getIfBody() {
        return ifBody;
    }

    public List<ElifStatement> getElifStatements() {
        return elifStatements;
    }

    public List<Statement> getElseBody() {
        return elseBody;
    }
}
