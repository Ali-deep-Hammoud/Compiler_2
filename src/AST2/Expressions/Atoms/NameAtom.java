package AST2.Expressions.Atoms;

import AST2.Expressions.Atom;

public class NameAtom extends Atom {
    private final String name;

    public NameAtom(int line, String name) {
        super(line, "Name Atom");
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
