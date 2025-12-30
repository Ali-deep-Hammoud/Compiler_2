package AST2.small_statement;

import AST2.Expr;
import AST2.SmallStatement;

public class AugmentedAssign extends SmallStatement {
    private final Expr target;
    private final String operator;
    private final Expr value;


    public AugmentedAssign(int line,Expr target, String operator, Expr value) {
        super(line,"Augmented Assign");
        this.target = target;
        this.operator = operator;
        this.value = value;
    }

    public Expr getTarget() {
        return target;
    }

    public Expr getValue() {
        return value;
    }

    public String getOperator() {
        return operator;
    }
}
