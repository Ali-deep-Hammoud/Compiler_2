package AST2.Expressions;

import AST2.Expr;

import java.beans.Expression;

public abstract class Atom extends Expr{

    public Atom(int line, String name) {
        super(line, name);
    }
}
