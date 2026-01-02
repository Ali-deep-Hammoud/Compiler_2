package AST2.Expressions.Atoms;

import AST2.Expressions.Atom;
import AST2.Expressions.CompForExpr;
import AST2.Expressions.ListExpr;

import java.util.ArrayList;
import java.util.List;

public class SetAtom extends Atom {
    private final List<SetElement> elements;
    private final CompForExpr compForExpr;
    public SetAtom(int line, CompForExpr compForExpr) {
        super(line,"Set Atom");
        this.compForExpr = compForExpr;
        this.elements = new ArrayList<>();
    }
    public void addElement(SetElement setElement) {
        this.elements.add(setElement);
    }
    public void removeElement(SetElement setElement) {
        this.elements.remove(setElement);
    }
    public List<SetElement> getElements() {
        return elements;
    }
    public CompForExpr getCompForExpr() {
        return compForExpr;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (!elements.isEmpty()) {
            for (SetElement e : elements) {
                sb.append(e.print(indentation)).append("\n");
            }
        }
        if (compForExpr != null) {
            sb.append(compForExpr.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}
