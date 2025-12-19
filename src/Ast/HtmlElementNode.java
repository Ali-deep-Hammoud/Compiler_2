package Ast;

import java.util.List;

public class HtmlElementNode extends AstNode{

    private final String tagName;
    private final List<AttributeNode> attributes;
    private final List<AstNode> children;

    public HtmlElementNode(String tagName, List<AttributeNode> attributes, List<AstNode> children) {
        super("HtmlElement");
        this.tagName = tagName;
        this.attributes = attributes;
        this.children = children;
    }

    public String getTagName() {
        return tagName;
    }

    public List<AttributeNode> getAttributes() {
        return attributes;
    }

    public List<AstNode> getChildren() {
        return children;
    }
}
