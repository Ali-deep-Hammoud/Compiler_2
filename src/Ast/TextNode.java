package Ast;

public class TextNode extends AstNode{

    private final String value;

    public TextNode(String value) {
        super("Text");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
