package AST;

public class CSSHSLFunction extends CSSFunction {
    private final double h, s, l;
    private final String unitH, unitS, unitL; // optional units

    public CSSHSLFunction(int line, double h, String unitH,
                           double s, String unitS,
                           double l, String unitL) {
        super(line, "HSLFunction");
        this.h = h; this.unitH = unitH;
        this.s = s; this.unitS = unitS;
        this.l = l; this.unitL = unitL;
    }

    public double getH() { return h; }
    public double getS() { return s; }
    public double getL() { return l; }
    public String getUnitH() { return unitH; }
    public String getUnitS() { return unitS; }
    public String getUnitL() { return unitL; }


}
