package Ast;

import java.util.List;

public class JinjaIfNode extends AstNode {

    private final JinjaConditionNode condition;
    private final List<AstNode> body;
    private final List<JinjaElifNode> elifBlocks;
    private final List<AstNode> elsebody;

    public JinjaIfNode(JinjaConditionNode condition, List<AstNode> body, List<JinjaElifNode> elifBlocks, List<AstNode> elsebody) {
        super("JinjaIf");
        this.condition = condition;
        this.body = body;
        this.elifBlocks = elifBlocks;
        this.elsebody = elsebody;
    }
    public JinjaConditionNode getCondition() {
        return condition;
    }
}
