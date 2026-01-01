package AST2.Expressions;

import AST2.Expr;

public class NormalVariable extends Variable {
    private final String name;
    private final Expr defaultValue;

    public NormalVariable(int line, String name, Expr defaultValue) {
        super(line, "Normal Variable");
        this.name = name;
        this.defaultValue = defaultValue;
    }
    public String getName() {
        return name;
    }
    public Expr getDefaultValue() {
        return defaultValue;
    }
}
