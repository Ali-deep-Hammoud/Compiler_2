package AST2.compound_statement;

import AST2.CompoundStatement;
import AST2.Expr;

public class ForStatement extends CompoundStatement {
    private final Expr target;
    private final Expr iterator;
    private final Body forBody;
    private final Body elseBody;

    public ForStatement(int line,Expr target, Expr iterator, Body forBody, Body elseBody) {
        super(line, "For Statement");
        this.iterator = iterator;
        this.target = target;
        this.forBody = forBody;
        this.elseBody = elseBody;
    }



    public Expr getTarget() {
        return target;
    }

    public Body getElseBody() {
        return elseBody;
    }

    public Body getForBody() {
        return forBody;
    }

    public Expr getIterator() {
        return iterator;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (target != null) {
            sb.append(target.print(indentation)).append("\n");
        }
        if (iterator != null) {
            sb.append(iterator.print(indentation)).append("\n");
        }
        if (forBody != null) {
            sb.append(forBody.print(indentation)).append("\n");
        }
        if (elseBody != null) {
            sb.append(elseBody.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}
