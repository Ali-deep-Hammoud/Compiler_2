package AST2.Expressions;

import AST2.Expr;
import AST2.compound_statement.Parameter;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpr extends Expr {
    private final List<Parameter> parameters;
    private final Expr body;

    public LambdaExpr(int line,Expr body) {
        super(line,"Lambda Expression");
        this.body = body;
        parameters = new ArrayList<>();
    }
    public void addParameter(Parameter parameter) {
        parameters.add(parameter);
    }
    public void removeParameter(Parameter parameter) {
        parameters.remove(parameter);
    }
    public List<Parameter> getParameters() {
        return parameters;
    }
    public Expr getBody() {
        return body;
    }
}
