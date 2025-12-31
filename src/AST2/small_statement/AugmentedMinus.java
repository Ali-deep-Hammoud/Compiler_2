package AST2.small_statement;

import AST2.Expr;

public class AugmentedMinus extends AugmentedAssign{
    public AugmentedMinus(int line, Expr target, Expr value) {
        super(line, target, value,"Augmented Minus");
    }
}
