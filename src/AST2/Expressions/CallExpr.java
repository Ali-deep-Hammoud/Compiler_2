package AST2.Expressions;

import AST2.Expr;

import java.util.List;

public class CallExpr extends Expr {
    private final Expr callee;
    private final List<Expr> args;
    public CallExpr(int line, Expr callee, List<Expr> args) {
        super(line, "CallExpr");
        this.callee = callee;
        this.args = args;
    }
    public Expr getCallee() {
        return callee;
    }

    public List<Expr> getArgs() {
        return args;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        if (callee != null) {
            sb.append(callee.print(indentation)).append("\n");
        }
        if(!args.isEmpty()) {
            for (Expr expr : args) {
                sb.append(expr.print(indentation)).append("\n");
            }
        }

        sb.append(indent).append("}");
        return sb.toString();
    }
}

