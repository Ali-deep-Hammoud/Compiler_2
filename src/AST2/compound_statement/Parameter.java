package AST2.compound_statement;

import AST2.Expr;
import AST2.Node;

public class Parameter extends Node {
    private final String name;
    private final Expr type;
    private final Expr defaultValue;

    public Parameter(int line,String name, Expr type, Expr defaultValue) {
        super(line,"Parameter");
        this.name = name;
        this.type = type;
        this.defaultValue = defaultValue;
    }
    public Expr getType() {
        return type;
    }
    public Expr getDefaultValue() {
        return defaultValue;
    }
    public String getName() {
        return name;
    }
}
