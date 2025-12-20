package Ast;

import java.util.List;

public class CssDeclarationNode extends AstNode {

    private final String property;
    private final List<CssValueNode> values;

    public CssDeclarationNode(String property, List<CssValueNode> values) {
        super("CssDeclaration");
        this.property = property;
        this.values = values;
    }

    public String getProperty() {
        return property;
    }

    public List<CssValueNode> getValues() {
        return values;
    }
}
