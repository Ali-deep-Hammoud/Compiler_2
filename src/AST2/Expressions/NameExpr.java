package AST2.Expressions;

import AST2.Expr;

public class NameExpr extends Expr {
    private final String name;

    public NameExpr(int line, String name) {
        super(line, "Name Expression");
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
