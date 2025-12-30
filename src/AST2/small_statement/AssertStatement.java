package AST2.small_statement;

import AST2.Expr;
import AST2.SmallStatement;

public class AssertStatement extends SmallStatement {
    private final Expr condition;
    private final Expr message;
    public AssertStatement(int line,Expr condition, Expr message) {
        super(line,"Assert Statement");
        this.condition = condition;
        this.message = message;
    }
    public Expr getCondition() {
        return condition;
    }
    public Expr getMessage() {
        return message;
    }
}
