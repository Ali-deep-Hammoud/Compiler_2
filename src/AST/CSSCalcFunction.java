package AST;

public class CSSCalcFunction extends CSSFunction {
    private final Double left;
    private final String leftUnit;
    private final String operator;
    private final Double right;
    private final String rightUnit;

    public CSSCalcFunction(int line, Double left, String leftUnit,
                            String operator, Double right, String rightUnit) {
        super(line, "Calc Function");
        this.left = left; this.leftUnit = leftUnit;
        this.operator = operator;
        this.right = right; this.rightUnit = rightUnit;
    }

    public Double getLeft() { return left; }
    public String getLeftUnit() { return leftUnit; }
    public String getOperator() { return operator; }
    public Double getRight() { return right; }
    public String getRightUnit() { return rightUnit; }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.name).append("- calc(");
        if (left != null) {
            stringBuilder.append(left);
        } else {
            stringBuilder.append(leftUnit);
        }
        stringBuilder.append(" ").append(operator).append(" ");
        if (right != null) {
            stringBuilder.append(right);
        } else {
            stringBuilder.append(rightUnit);
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
