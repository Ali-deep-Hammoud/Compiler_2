package AST2.small_statement;

import AST2.Expr;

public class AugmentedMuliply extends AugmentedAssign{
    public AugmentedMuliply(int line, Expr target, Expr value) {
        super(line,target,value,"Augmented Muliply");
    }
}
