package AST2.small_statement;

import AST2.Expr;
import AST2.SmallStatement;

import java.util.ArrayList;
import java.util.List;

public class DelStatement extends SmallStatement {
    private final List<Expr> targets;

    public DelStatement(int line) {
        super(line, "Del Statement");
        this.targets = new ArrayList<>();
    }
    public void addTarget(Expr expr){
        this.targets.add(expr);
    }
    public void removeTarget(Expr expr){
        this.targets.remove(expr);
    }
    public List<Expr> getTargets(){
        return this.targets;
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
        sb.append(indent).append("}");
        return sb.toString();
    }
}
