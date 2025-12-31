package AST2.small_statement;

import AST2.Expr;

public class AugmentedAT extends AugmentedAssign{

    public AugmentedAT(int line, Expr target, Expr value) {
        super(line, target, value, "Augmented @");
    }
}
