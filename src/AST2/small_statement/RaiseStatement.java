package AST2.small_statement;

import AST2.Expr;
import AST2.SmallStatement;

public class RaiseStatement extends SmallStatement {
    private final Expr exception;
    private final Expr cause;

    public RaiseStatement(int line,Expr exception, Expr cause) {
        super(line,"Raise Statement");
        this.exception = exception;
        this.cause = cause;
    }
    public Expr getException() {
        return exception;
    }
    public Expr getCause() {
        return cause;
    }
}
