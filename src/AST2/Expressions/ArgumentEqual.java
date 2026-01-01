package AST2.Expressions;

import AST2.Expr;

public class ArgumentEqual extends Argument{
    private final Expr name;
    private final Expr value;
    public ArgumentEqual(int line,Expr name, Expr value) {
        super(line,"Equal Argument");
        this.name = name;
        this.value = value;
    }
    public Expr getName() {
        return name;
    }
    public Expr getValue() {
        return value;
    }

}
