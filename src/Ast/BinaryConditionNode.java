package Ast;

public class BinaryConditionNode extends AstNode{

    private final JinjaConditionNode left;
    private final String operator;
    private  final JinjaConditionNode right;

    public BinaryConditionNode(JinjaConditionNode left, String operator, JinjaConditionNode right) {
        super("BinaryCondition");
        this.left = left;
        this.operator = operator;
        this.right = right;
    }


}
