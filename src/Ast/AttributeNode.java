package Ast;

public class AttributeNode extends AstNode{

    private final String name;
    private final String literalValue;
    private final JinjaExpressionNode jinjaValue;

    public AttributeNode(String name, String literalValue) {
        super("Attribute");
        this.name = name;
        this.literalValue = literalValue;
        this.jinjaValue = null;
    }

    public AttributeNode(String name, JinjaExpressionNode jinjaValue) {
        super("Attribute");
        this.name = name;
        this.literalValue = null;
        this.jinjaValue = jinjaValue;
    }

    public String getName() {
        return name;
    }

    public String getLiteralValue() {
        return literalValue;
    }

    public JinjaExpressionNode getJinjaValue() {
        return jinjaValue;
    }
}
