package AST2.Expressions;

import AST2.Expr;

public abstract class Argument extends Expr {
    public Argument(int line, String name) {
        super(line, name);
    }
}
