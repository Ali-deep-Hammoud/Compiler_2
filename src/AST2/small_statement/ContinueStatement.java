package AST2.small_statement;

import AST2.SmallStatement;

public class ContinueStatement extends FlowStatement {
    public ContinueStatement(int line) {
        super(line, "Continue Statement");
    }
}
