package Ast;

public class HtmlCommentNode extends AstNode{

    private final String value;

    public HtmlCommentNode(String value) {
        super("HtmlComment");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
