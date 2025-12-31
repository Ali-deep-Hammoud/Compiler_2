package AST2.small_statement;

import AST2.Expr;

public class AugmentedDivide extends AugmentedAssign{
    public AugmentedDivide(int line, Expr target, Expr value) {
        super(line,target,value,"Augmented Divide");
    }
}
