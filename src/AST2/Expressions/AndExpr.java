package AST2.Expressions;

import AST2.Expr;

import java.util.ArrayList;
import java.util.List;

public class AndExpr extends Expr {
    private final List<Expr> expressions;
    public AndExpr(int line) {
        super(line,"Boolean Expression");
        expressions = new ArrayList<>();
    }
    public void addExpression(Expr expr) {
        expressions.add(expr);
    }
    public void removeExpression(Expr expr) {
        expressions.remove(expr);
    }
    public List<Expr> getExpressions() {
        return expressions;
    }


}
