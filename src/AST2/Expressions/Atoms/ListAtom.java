package AST2.Expressions.Atoms;

import AST2.Expr;
import AST2.Expressions.Atom;

import java.util.ArrayList;
import java.util.List;

public class ListAtom extends Atom {
    private final List<Expr> elements;

    public ListAtom(int line) {
        super(line, "List Atom");
        this.elements = new ArrayList<>();
    }
    public void addElement(Expr e) {
        this.elements.add(e);
    }
    public void removeElement(Expr e) {
        this.elements.remove(e);
    }
    public List<Expr> getElements() {
        return elements;
    }
}
