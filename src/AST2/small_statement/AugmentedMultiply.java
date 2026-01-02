package AST2.small_statement;

import AST2.Expr;

public class AugmentedMultiply extends AugmentedAssign{
    public AugmentedMultiply(int line, Expr target, Expr value) {
        super(line,target,value,"Augmented Multiply");
    }
}
