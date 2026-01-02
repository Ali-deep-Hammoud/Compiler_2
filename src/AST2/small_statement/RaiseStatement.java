package AST2.small_statement;

import AST2.Expr;
import AST2.SmallStatement;

public class RaiseStatement extends FlowStatement {
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
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        if(exception != null) {
            sb.append(exception.print(indentation)).append("\n");
        }
        if (cause != null) {
            sb.append(cause.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}
