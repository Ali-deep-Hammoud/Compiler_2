package AST2.compound_statement;

import AST2.CompoundStatement;
import AST2.Expr;
import AST2.Statement;

import java.util.ArrayList;
import java.util.List;

public class FunctionStatement extends CompoundStatement {
    private final String name;
    private final List<Parameter> parameters;
    private final Expr returnType;
    private final List<Statement> body;

    public FunctionStatement(int line, String name, Expr returnType) {
        super(line, "Function Statement");
        this.name = name;
        this.returnType = returnType;
        this.body = new ArrayList<>();
        this.parameters = new ArrayList<>();
    }
    public void addParameter(Parameter parameter) {
        this.parameters.add(parameter);
    }
    public void addBodyStatement(Statement statement) {
        this.body.add(statement);
    }
    public void removeBodyStatement(Statement statement) {
        this.body.remove(statement);
    }
    public void removeParameter(Parameter parameter) {
        this.parameters.remove(parameter);
    }

    public String getName() {
        return name;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public Expr getReturnType() {
        return returnType;
    }

    public List<Statement> getBody() {
        return body;
    }
}

