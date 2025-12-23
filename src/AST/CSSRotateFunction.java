package AST;

public class CSSRotateFunction extends CSSFunction {
    private final double angle;
    private final String unit;

    public CSSRotateFunction(int line, double angle, String unit) {
        super(line, "Rotate Function");
        this.angle = angle;
        this.unit = unit;
    }

    public double getAngle() { return angle; }
    public String getUnit() { return unit; }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.name + "- rotate( ");
        stringBuilder.append(angle);
        if (unit != null) {
            stringBuilder.append(unit);
        }
        stringBuilder.append(" )");
        return stringBuilder.toString();
    }
}
