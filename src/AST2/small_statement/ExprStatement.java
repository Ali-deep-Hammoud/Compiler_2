package AST2.small_statement;

import AST2.Expr;
import AST2.SmallStatement;

public class ExprStatement extends SmallStatement {
    private Expr expr;
    public ExprStatement(int line, Expr expr) {
        super(line, "Expression Statement");
        this.expr = expr;
    }

    public Expr getExpr() {
        return expr;
    }
}
