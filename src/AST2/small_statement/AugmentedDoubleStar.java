package AST2.small_statement;

import AST2.Expr;

public class AugmentedDoubleStar extends AugmentedAssign{

    public AugmentedDoubleStar(int line, Expr target, Expr value) {
        super(line, target, value, "Augmented Double Star");
    }
}
