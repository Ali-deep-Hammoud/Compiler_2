package AST2.Expressions;

import AST2.Expr;

import java.util.ArrayList;
import java.util.List;

public class ListExpr extends Expr {
    private final List<Expr> list;
    public ListExpr(int line) {
        super(line,"List Expression");
        this.list = new ArrayList<>();
    }
    public void add(Expr expr) {
        list.add(expr);
    }
    public void remove(Expr expr) {
        list.remove(expr);
    }
    public List<Expr> getList() {
        return list;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        if(!list.isEmpty()) {
            for (Expr expr : list) {
                sb.append(expr.print(indentation)).append("\n");
            }
        }

        sb.append(indent).append("}");
        return sb.toString();
    }
}
