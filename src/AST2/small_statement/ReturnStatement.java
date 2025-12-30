package AST2.small_statement;

import AST2.Expr;
import AST2.SmallStatement;

public class ReturnStatement extends SmallStatement {
    private final Expr value;

    public ReturnStatement(int line, Expr value) {
        super(line, "Return Statement");
        this.value = value;
    }

    public Expr getValue() {
        return value;
    }
}
