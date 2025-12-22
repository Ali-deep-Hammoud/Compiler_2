package AST;

public class CSSTranslateFunction extends CSSFunction {
    private final double x, y;
    private final String unitX, unitY;
    private final boolean isFull;

    // For TranslateX or TranslateY
    public CSSTranslateFunction(int line, double value, String unit, boolean isX) {
        super(line, isX ? "TranslateX Function" : "TranslateY Function");
        if(isX) { this.x = value; this.unitX = unit; this.y = 0; this.unitY = null; }
        else { this.y = value; this.unitY = unit; this.x = 0; this.unitX = null; }
        this.isFull = false;
    }

    public CSSTranslateFunction(int line, double x, String unitX, double y, String unitY) {
        super(line, "TranslateFull Function");
        this.x = x; this.unitX = unitX;
        this.y = y; this.unitY = unitY;
        this.isFull = true;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public String getUnitX() { return unitX; }
    public String getUnitY() { return unitY; }
    public boolean isFull() { return isFull; }
}
