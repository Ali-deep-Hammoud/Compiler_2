package Ast;

import java.util.List;

public class HtmlVoidElementNode extends AstNode{

    private final String tagName;
    private final List<AttributeNode> attributes;

    public HtmlVoidElementNode(String tagName, List<AttributeNode> attributes) {
        super("HtmlVoidElement");
        this.tagName = tagName;
        this.attributes = attributes;
    }

    public String getTagName() {
        return tagName;
    }

    public List<AttributeNode> getAttributes() {

        return attributes;
    }
}
