package AST2.compound_statement;

import AST2.CompoundStatement;
import AST2.Statement;

import java.util.ArrayList;
import java.util.List;

public class TryStatement extends CompoundStatement {
    private final List<Statement> forBody;
    private final List<ExceptStatement> excepts;
    private final List<Statement> elseBody;
    private final List<Statement> finallyBody;

    public TryStatement(int line) {
        super(line, "Try Statement");
        this.forBody = new ArrayList<>();
        this.excepts = new ArrayList<>();
        this.elseBody = new ArrayList<>();
        this.finallyBody = new ArrayList<>();
    }
    public void addForBodyStatement(Statement statement) {
        this.forBody.add(statement);
    }
    public void addExceptStatement(ExceptStatement statement) {
        this.excepts.add(statement);
    }
    public void addElseBodyStatement(Statement statement) {
        this.elseBody.add(statement);
    }
    public void addFinallyBodyStatement(Statement statement) {
        this.finallyBody.add(statement);
    }
    public void removeForBodyStatement(Statement statement) {
        this.forBody.remove(statement);
    }
    public void removeExceptStatement(ExceptStatement statement) {
        this.excepts.remove(statement);
    }
    public void removeElseBodyStatement(Statement statement) {
        this.elseBody.remove(statement);
    }
    public void removeFinallyBodyStatement(Statement statement) {
        this.finallyBody.remove(statement);
    }
    public List<Statement> getForBody() {
        return forBody;
    }
    public List<ExceptStatement> getExcepts() {
        return excepts;
    }
    public List<Statement> getElseBody() {
        return elseBody;
    }
    public List<Statement> getFinallyBody() {
        return finallyBody;
    }
}
