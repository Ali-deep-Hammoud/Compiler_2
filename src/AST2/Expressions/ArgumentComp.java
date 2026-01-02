package AST2.Expressions;

import AST2.Expr;

public class ArgumentComp extends Argument{
    private final Expr expr;
    private final CompForExpr comp;
    public ArgumentComp(int line,Expr expr, CompForExpr comp) {
        super(line,"Argument Comp");
        this.expr = expr;
        this.comp = comp;
    }
    public Expr getExpr() {
        return expr;
    }
    public CompForExpr getComp() {
        return comp;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (expr != null) {
            sb.append(expr.print(indentation)).append("\n");
        }
        if (comp != null) {
            sb.append(comp.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }

}
