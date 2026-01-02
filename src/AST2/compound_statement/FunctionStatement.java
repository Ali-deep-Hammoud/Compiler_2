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
    private final Body body;

    public FunctionStatement(int line, String name, Expr returnType,Body body, List<Parameter> parameters) {
        super(line, "Function Statement");
        this.name = name;
        this.returnType = returnType;
        this.body = body;
        if(parameters != null){
            this.parameters = parameters;

        }else {
            this.parameters = new ArrayList<>();

        }
    }
    public void addParameter(Parameter parameter) {
        this.parameters.add(parameter);
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

    public Body getBody() {
        return body;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (!parameters.isEmpty()) {
            for (Parameter parameter : parameters) {
                sb.append(parameter.print(indentation)).append("\n");
            }
        }
        if (returnType != null) {
            sb.append(returnType.print(indentation)).append("\n");
        }
        if (body != null) {
            sb.append(body.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}

