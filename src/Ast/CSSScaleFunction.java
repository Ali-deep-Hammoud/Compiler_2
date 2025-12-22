package AST;

public class CSSScaleFunction extends CSSFunction {
    private final double x, y;
    private final boolean isFull;

    public CSSScaleFunction(int line, double value, boolean isX) {
        super(line, isX ? "ScaleX Function" : "ScaleY Function");
        if(isX) { this.x = value; this.y = 1; } else { this.x = 1; this.y = value; }
        this.isFull = false;
    }

    public CSSScaleFunction(int line, double valueX, double valueY) {
        super(line, "ScaleFull Function");
        this.x = valueX; this.y = valueY;
        this.isFull = true;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public boolean isFull() { return isFull; }
}
