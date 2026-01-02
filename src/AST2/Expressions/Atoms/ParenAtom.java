package AST2.Expressions.Atoms;

import AST2.Expr;
import AST2.Expressions.Atom;

import java.util.ArrayList;
import java.util.List;

public class ParenAtom extends Atom {
    private final List<Expr> exprs;
    public ParenAtom(int line) {
        super(line, "Paren Atom");
        this.exprs = new ArrayList<>();

    }
    public void addExpr(Expr expr) {
        this.exprs.add(expr);
    }
    public void removeExpr(Expr expr) {
        this.exprs.remove(expr);
    }
    public List<Expr> getExpr() {
        return exprs;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (!exprs.isEmpty()) {
            for (Expr expr : exprs) {
                sb.append(expr.print(indentation)).append("\n");
            }
        }

        sb.append(indent).append("}");
        return sb.toString();
    }
}
