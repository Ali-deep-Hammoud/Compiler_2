package AST2.small_statement;

import AST2.Expr;

public class AugmentedRemain extends AugmentedAssign{
    public AugmentedRemain(int line, Expr target, Expr value) {
        super(line,target,value,"Augmented Remain");
    }
}
