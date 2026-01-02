package AST2.small_statement;

import AST2.Expr;
import AST2.SmallStatement;

public class YieldStatement extends FlowStatement {
    private final Expr value;
    public YieldStatement(int line,Expr value) {
        super(line,"Yield Statement");
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
        if(value != null) {
            sb.append(value.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}
