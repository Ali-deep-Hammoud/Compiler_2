package AST2.Expressions.Atoms;

import AST2.Expressions.Atom;

public class BooleanAtom extends Atom {
    private final boolean value;
    public BooleanAtom(int line,boolean value) {
        super(line, "Boolean Atom");
        this.value = value;
    }
    public boolean getValue() {
        return value;
    }
}
