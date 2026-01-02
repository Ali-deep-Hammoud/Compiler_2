package AST2.Expressions;

import AST2.Expr;

public class NormalVariable extends Variable {
    private final String name;
    private final Expr defaultValue;

    public NormalVariable(int line, String name, Expr defaultValue) {
        super(line, "Normal Variable");
        this.name = name;
        this.defaultValue = defaultValue;
    }
    public String getName() {
        return name;
    }
    public Expr getDefaultValue() {
        return defaultValue;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (defaultValue != null) {
            sb.append(defaultValue.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}
