
package AST2.compound_statement;

import AST2.CompoundStatement;
import AST2.Expr;
import AST2.Statement;

import java.util.ArrayList;
import java.util.List;

public class WhileStatement extends CompoundStatement {
    private final Expr condition;
    private final List<Statement> whileBody;
    private final List<Statement> elseBody;

    public WhileStatement(int line, Expr condition) {
        super(line, "While Statement");
        this.condition = condition;
        this.whileBody = new ArrayList<>();
        this.elseBody = new ArrayList<>();
    }
    public void addWhileBodyStatement(Statement statement) {
        this.whileBody.add(statement);
    }
    public void addElseBodyStatement(Statement statement) {
        this.elseBody.add(statement);
    }

    public void removeWhileBodyStatement(Statement statement) {
        this.whileBody.remove(statement);
    }
    public void removeElseBodyStatement(Statement statement) {
        this.elseBody.remove(statement);
    }


    public Expr getCondition() {
        return condition;
    }

    public List<Statement> getWhileBody() {
        return whileBody;
    }


    public List<Statement> getElseBody() {
        return elseBody;
    }
}
