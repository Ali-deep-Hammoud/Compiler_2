package AST2.compound_statement;

import AST2.CompoundStatement;
import AST2.Expr;
import AST2.Statement;

import java.util.ArrayList;
import java.util.List;

public class ForStatement extends CompoundStatement {
    private final Expr target;
    private final Expr Iterator;
    private final Body forBody;
    private final Body elseBody;

    public ForStatement(int line,Expr target, Expr iterator, Body forBody, Body elseBody) {
        super(line, "For Statement");
        this.Iterator = iterator;
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
        return Iterator;
    }
}
