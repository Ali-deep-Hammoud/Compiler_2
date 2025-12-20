package Ast;

import java.util.List;

public class CssRuleNode extends AstNode {

    private final List<CssSelectorNode> selectors;
    private final List<CssDeclarationNode> declarations;

    public CssRuleNode(List<CssSelectorNode> selectors, List<CssDeclarationNode> declarations) {
        super("CssRule");
        this.selectors = selectors;
        this.declarations = declarations;
    }

    public List<CssSelectorNode> getSelectors() {
        return selectors;
    }

    public List<CssDeclarationNode> getDeclarations() {
        return declarations;
    }

}
