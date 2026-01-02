package AST2.Expressions.Atoms;

import AST2.Expr;

public class SetValue extends SetElement{
    private final Expr value;
    public SetValue(int line,Expr value){
        super(line, "Set Value");
        this.value = value;
    }
    public Expr getValue() {
        return value;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";


        if (value != null) {
            sb.append(value.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}
