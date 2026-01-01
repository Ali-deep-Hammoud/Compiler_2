package AST2.Expressions.Atoms;

import AST2.Expressions.Atom;

public class NumberAtom extends Atom {
    private final String name;

    public NumberAtom(int line, String name) {
        super(line, "Number Atom");
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
