package AST;

public class CompareCondition extends Condition {
    private final String leftValue;
    private final String operator;
    private final String rightValue;
    public CompareCondition(int line,String leftValue,String operator, String rightValue) {
        super(line,"Compare Condition");
        this.leftValue = leftValue;
        this.operator = operator;
        this.rightValue = rightValue;
    }
    public String getLeftValue() {
        return leftValue;
    }
    public String getOperator() {
        return operator;
    }
    public String getRightValue() {
        return rightValue;
    }
}
