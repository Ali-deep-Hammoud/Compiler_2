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
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (!subscripts.isEmpty()) {
            for (Subscript subscript : subscripts) {
                sb.append(subscript.print(indentation)).append("\n");
            }
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}
