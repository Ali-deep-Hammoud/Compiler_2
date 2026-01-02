package AST2.Expressions;


import AST2.Expr;

public class AttributeExpr extends Expr {
    private final Expr target;
    private final String name;
    public AttributeExpr(int line, Expr target, String name) {
        super(line, "AttributeExpr");
        this.target = target;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Expr getTarget() {
        return target;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (target != null) {
            sb.append(target.print(indentation)).append("\n");
        }

        sb.append(indent).append("}");
        return sb.toString();
    }
}