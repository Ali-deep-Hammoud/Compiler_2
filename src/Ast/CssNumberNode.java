package Ast;

import org.antlr.v4.runtime.atn.PredicateTransition;

public class CssNumberNode extends CssValueNode{

    private final double value;
    private final String unit;

    public CssNumberNode(double value, String unit) {
        super("CssNumber");
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }
}
