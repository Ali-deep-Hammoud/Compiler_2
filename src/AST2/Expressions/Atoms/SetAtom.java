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
}
