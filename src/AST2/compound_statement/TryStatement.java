package AST2.compound_statement;

import AST2.CompoundStatement;
import AST2.Statement;

import java.util.ArrayList;
import java.util.List;

public class TryStatement extends CompoundStatement {
    private final Body tryBody;
    private final List<ExceptStatement> excepts;
    private  Body elseBody;
    private  Body finallyBody;

    public TryStatement(int line,Body tryBody, Body elseBody, Body finallyBody) {
        super(line, "Try Statement");
        this.tryBody = tryBody;
        this.excepts = new ArrayList<>();
        this.elseBody = elseBody;
        this.finallyBody = finallyBody;
    }
    public void addExceptStatement(ExceptStatement statement) {
        this.excepts.add(statement);
    }

    public void removeExceptStatement(ExceptStatement statement) {
        this.excepts.remove(statement);
    }

    public void setElseBody(Body elseBody) {
        this.elseBody = elseBody;
    }

    public void setFinallyBody(Body finallyBody) {
        this.finallyBody = finallyBody;
    }

    public Body getForBody() {
        return tryBody;
    }
    public List<ExceptStatement> getExcepts() {
        return excepts;
    }
    public Body getElseBody() {
        return elseBody;
    }
    public Body getFinallyBody() {
        return finallyBody;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";


        if (tryBody != null) {
            sb.append(tryBody.print(indentation)).append("\n");
        }
        if (!excepts.isEmpty()) {
            for (ExceptStatement exceptStatement : excepts) {
                sb.append(exceptStatement.print(indentation)).append("\n");
            }
        }
        if (elseBody != null) {
            sb.append(elseBody.print(indentation)).append("\n");
        }
        if (finallyBody != null) {
            sb.append(finallyBody.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}
