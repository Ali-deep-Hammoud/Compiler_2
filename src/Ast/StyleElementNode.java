package Ast;

import java.util.List;

public class StyleElementNode extends AstNode{

    private final List<CssRuleNode> rules;

    public StyleElementNode(String type, List<CssRuleNode> rules) {
        super("StyleElement");
        this.rules = rules;
    }

    public List<CssRuleNode> getRules() {
        return rules;
    }
}
