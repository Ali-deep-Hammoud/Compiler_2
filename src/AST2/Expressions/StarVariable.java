package AST2.Expressions;

import AST2.Expr;

public class StarVariable extends Variable {
    private final String name;
    public StarVariable(int line,String name) {
        super(line,"Star Variable");
        this.name = name;
    }
    public String getName() {
        return name ;
    }

}
