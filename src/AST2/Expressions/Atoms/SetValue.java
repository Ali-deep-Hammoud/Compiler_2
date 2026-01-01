package AST2.Expressions.Atoms;

import AST2.Expr;

public class SetValue extends SetElement{
    private final Expr value;
    public SetValue(int line,Expr value){
        super(line, "Set Value");
        this.value = value;
    }
    public Expr getValue() {
        return value;
    }
}
