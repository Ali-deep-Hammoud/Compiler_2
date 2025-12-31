package AST2.small_statement;

import AST2.Expr;
import AST2.SmallStatement;

public abstract class AugmentedAssign extends SmallStatement {
    private final Expr target;
    private final Expr value;


    public AugmentedAssign(int line, Expr target, Expr value,String name) {
        super(line,name);
        this.target = target;
        this.value = value;
    }

    public Expr getTarget() {
        return target;
    }

    public Expr getValue() {
        return value;
    }

}
