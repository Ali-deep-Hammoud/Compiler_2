package AST2.Expressions.Atoms;

import AST2.Expr;
import AST2.Expressions.Atom;
import AST2.Expressions.CompForExpr;
import AST2.Expressions.ListExpr;

import java.util.ArrayList;
import java.util.List;

public class DictAtom extends Atom {
    private final List<DictElement> elements;
    private final CompForExpr expr;


    public DictAtom(int line, CompForExpr expr) {
        super(line, "Dict Atom");
        this.expr = expr;
        this.elements = new ArrayList<>();
    }
    public void addElement(DictElement e) {
        elements.add(e);
    }
    public void removeElement(DictElement e) {
        elements.remove(e);
    }
    public List<DictElement> getElements() {
        return elements;
    }
    public CompForExpr getExpr() {
        return expr;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (!elements.isEmpty()) {
            for (DictElement e : elements) {
                sb.append(e.print(indentation)).append("\n");
            }
        }
        if (expr != null) {
            sb.append(expr.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}
