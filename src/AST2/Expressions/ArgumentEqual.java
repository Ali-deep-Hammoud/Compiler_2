package AST2.Expressions;

import AST2.Expr;

public class ArgumentEqual extends Argument{
    private final Expr name;
    private final Expr value;
    public ArgumentEqual(int line,Expr name, Expr value) {
        super(line,"Equal Argument");
        this.name = name;
        this.value = value;
    }
    public Expr getName() {
        return name;
    }
    public Expr getValue() {
        return value;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (name != null) {
            sb.append(name.print(indentation)).append("\n");
        }
        if (value != null) {
            sb.append(value.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }

}
