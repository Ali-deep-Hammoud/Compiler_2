package AST;

public class CSSCalcFunction extends CSSFunction {
    private final double left;
    private final String leftUnit;
    private final String operator;
    private final double right;
    private final String rightUnit;

    public CSSCalcFunction(int line, double left, String leftUnit,
                            String operator, double right, String rightUnit) {
        super(line, "Calc Function");
        this.left = left; this.leftUnit = leftUnit;
        this.operator = operator;
        this.right = right; this.rightUnit = rightUnit;
    }

    public double getLeft() { return left; }
    public String getLeftUnit() { return leftUnit; }
    public String getOperator() { return operator; }
    public double getRight() { return right; }
    public String getRightUnit() { return rightUnit; }

}
