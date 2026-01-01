package AST2.Expressions;

import AST2.Expr;
import AST2.compound_statement.Parameter;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpr extends Expr {
    private final List<Variable> variables;
    private final Expr body;

    public LambdaExpr(int line,Expr body,List<Variable> variables) {
        super(line,"Lambda Expression");
        this.body = body;
        if (variables != null) {this.variables = variables;}
        else {

            this.variables = new ArrayList<>();
        }
    }
    public void addVariable(Variable variable) {
        variables.add(variable);
    }
    public void removeVariable(Variable variable) {
        variables.remove(variable);
    }
    public List<Variable> getVariables() {
        return variables;
    }
    public Expr getBody() {
        return body;
    }
}
