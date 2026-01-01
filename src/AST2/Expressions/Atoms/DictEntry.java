package AST2.Expressions.Atoms;

import AST2.Expr;
import AST2.Node;

public class DictEntry extends DictElement {
    private final Expr key;
    private final Expr value;
    public DictEntry(int line,Expr key, Expr value) {
        super(line,"Dict Entry");
        this.key = key;
        this.value = value;
    }
    public Expr getKey() {
        return key;
    }
    public Expr getValue() {
        return value;
    }

}
