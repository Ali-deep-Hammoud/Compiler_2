package AST2.Expressions;

import AST2.Expr;

public class CompIfExpr extends Expr {
    private final Expr expr;
    private final Expr loop;

    public CompIfExpr(int line,Expr expr, Expr loop) {
        super(line,"Comp If Expression");
        this.expr = expr;
        this.loop = loop;
    }

    public Expr getLoop() {
        return loop;
    }

    public Expr getExpr() {
        return expr;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";


        if (expr != null) {
            sb.append(expr.print(indentation)).append("\n");
        }
        if (loop != null) {
            sb.append(loop.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}
