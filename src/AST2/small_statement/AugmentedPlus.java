package AST2.small_statement;

import AST2.Expr;

public class AugmentedPlus extends AugmentedAssign{

    public AugmentedPlus(int line, Expr target, Expr value) {
        super(line, target, value,"Augmented Plus");
    }

}
