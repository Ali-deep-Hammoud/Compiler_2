
package AST2.compound_statement;

import AST2.CompoundStatement;
import AST2.Expr;
import AST2.Statement;

import java.util.ArrayList;
import java.util.List;

public class WhileStatement extends CompoundStatement {
    private final Expr condition;
    private final Body whileBody;
    private final Body elseBody;

    public WhileStatement(int line, Expr condition, Body whileBody, Body elseBody) {
        super(line, "While Statement");
        this.condition = condition;
        this.whileBody = whileBody;
        this.elseBody = elseBody;
    }

    public Expr getCondition() {
        return condition;
    }

    public Body getWhileBody() {
        return whileBody;
    }


    public Body getElseBody() {
        return elseBody;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";


        if (condition != null) {
            sb.append(condition.print(indentation)).append("\n");
        }

        if (whileBody != null) {
            sb.append(whileBody.print(indentation)).append("\n");
        }
        if (elseBody != null) {
            sb.append(elseBody.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}
