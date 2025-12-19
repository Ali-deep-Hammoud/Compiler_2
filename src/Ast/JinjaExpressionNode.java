package Ast;

import java.util.List;

public class JinjaExpressionNode extends AstNode {

    private final List<String> expressions;

    public JinjaExpressionNode(List<String> expressions) {
        super("JinjaExpression");
        this.expressions = expressions;
    }

    public List<String> getExpressions() {
        return expressions;
    }
}
