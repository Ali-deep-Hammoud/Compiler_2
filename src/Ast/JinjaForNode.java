package Ast;

import java.util.List;

public class JinjaForNode extends AstNode {
    private final String variable;
    private final String iterable;
    private final JinjaConditionNode condition;
    private final List<AstNode>  body;
    private final List<AstNode> elsebody;

    public JinjaForNode(String variable, String iterable, JinjaConditionNode condition, List<AstNode> body, List<AstNode> elsebody) {
        super("JinjaFor");
        this.variable = variable;
        this.iterable = iterable;
        this.condition = condition;
        this.body = body;
        this.elsebody = elsebody;
    }

}
