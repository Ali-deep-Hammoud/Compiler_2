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
}
