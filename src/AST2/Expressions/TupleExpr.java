package AST2.Expressions;

import AST2.Expr;

import java.util.ArrayList;
import java.util.List;

public class TupleExpr extends Expr {
    private final List<Expr> elements;

    public TupleExpr(int line) {
        super(line, "Tuple Expression");
        elements = new ArrayList<>();
    }
    public void addElement(Expr e) {
        elements.add(e);
    }
    public void removeElement(Expr e) {
        elements.remove(e);
    }
    public List<Expr> getElements() {
        return elements;
    }
}
