package AST2.Expressions;

import AST2.Expr;

public class Ifexpr extends Expr {
    private final Expr condition;
    private final Expr thenExpression;
    private final Expr elseExpression;

    public Ifexpr(int line,Expr condition, Expr thenExpression, Expr elseExpression) {
        super(line,"If expression");
        this.condition = condition;
        this.thenExpression = thenExpression;
        this.elseExpression = elseExpression;
    }

    public Expr getCondition() {
        return condition;
    }

    public Expr getThenExpression() {
        return thenExpression;
    }

    public Expr getElseExpression() {
        return elseExpression;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (condition != null) {
            sb.append(condition.print(indentation)).append("\n");
        }
        if (thenExpression != null) {
            sb.append(thenExpression.print(indentation)).append("\n");
        }
        if (elseExpression != null) {
            sb.append(elseExpression.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}
