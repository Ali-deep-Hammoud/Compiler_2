package AST2.small_statement;

import AST2.SmallStatement;

public class PassStatement extends SmallStatement {
    public PassStatement(int line) {
        super(line, "Pass Statement");
    }
}
