package AST2.Expressions.Atoms;

import AST2.Expr;
import AST2.Expressions.Atom;

import java.util.ArrayList;
import java.util.List;

public class StringAtom extends Atom {
    private final List<String> strings;

    public StringAtom(int line) {
        super(line, "String Atom");
        this.strings = new ArrayList<>();
    }
    public void addString(String string) {
        this.strings.add(string);
    }
    public void removeString(String string) {
        this.strings.remove(string);
    }
    public List<String> getStrings() {
        return strings;
    }
}
