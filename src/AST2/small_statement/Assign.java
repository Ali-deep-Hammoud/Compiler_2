package AST2.small_statement;

import AST2.Expr;
import AST2.SmallStatement;

import java.util.ArrayList;
import java.util.List;

public class Assign extends SmallStatement {
    private final List<Expr> targets;
    private final Expr value;

    public Assign(int line, Expr value) {
        super(line, "Assign");
        targets = new ArrayList<>();
        this.value = value;
    }
    public void addTarget(Expr expr) {
        targets.add(expr);
    }
    public void removeTarget(Expr expr) {
        targets.remove(expr);
    }
    public List<Expr> getTargets() {
        return targets;
    }
    public Expr getValue() {
        return value;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        if(!targets.isEmpty()) {
            for (Expr expr : targets) {
                sb.append(expr.print(indentation)).append("\n");
            }
        }
        if (value != null) {
            sb.append(value.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}
