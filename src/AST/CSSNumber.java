package AST;

public class CSSNumber extends CSSTerm {
    Double value;
    String unit;
    public CSSNumber(int line,Double value, String unit) {
        super(line,"CSS Number");
        this.value = value;
        this.unit = unit;
    }

    public Double getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }
}
