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
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (key != null) {
            sb.append(key.print(indentation)).append("\n");
        }
        if (value != null) {
            sb.append(value.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }

}
