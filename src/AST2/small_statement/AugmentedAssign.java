package AST2.small_statement;

import AST2.Expr;
import AST2.SmallStatement;

public abstract class AugmentedAssign extends SmallStatement {
    private final Expr target;
    private final Expr value;


    public AugmentedAssign(int line, Expr target, Expr value,String name) {
        super(line,name);
        this.target = target;
        this.value = value;
    }

    public Expr getTarget() {
        return target;
    }

    public Expr getValue() {
        return value;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";
        if(target != null) {
            sb.append(target.print(indentation)).append("\n");
        }
        if (value != null) {
            sb.append(value.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }

}
