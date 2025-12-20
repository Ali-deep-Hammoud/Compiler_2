package Ast;

public class CssSelectorNode extends AstNode {

    public enum Kind {
        TAG, CLASS, ID, ALL
    }

    private final Kind kind;
    private final String name;

    public CssSelectorNode(Kind kind, String name) {
        super("CssSelector");
        this.kind = kind;
        this.name = name;
    }

    public Kind getKind() {
        return kind;
    }

    public String getName() {
        return name;
    }
}
