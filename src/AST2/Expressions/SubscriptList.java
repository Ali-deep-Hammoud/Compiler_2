package AST2.Expressions;

import AST2.Expr;

import java.util.ArrayList;
import java.util.List;

public class SubscriptList extends Expr {
    private final List<Subscript> subscripts;

    public SubscriptList(int line) {
        super(line, "Subscript List");
        this.subscripts = new ArrayList<>();
    }
    public void addSubscript(Subscript subscript) {
        subscripts.add(subscript);
    }
    public void removeSubscript(Subscript subscript) {
        subscripts.remove(subscript);
    }
    public List<Subscript> getSubscripts() {
        return subscripts;
    }
}
