package AST2.small_statement;

import AST2.Expr;
import AST2.SmallStatement;

public class YieldStatement extends SmallStatement {
    private final Expr value;
    public YieldStatement(int line,Expr value) {
        super(line,"Yield Statement");
        this.value = value;
    }
    public Expr getValue() {
        return value;
    }
}
