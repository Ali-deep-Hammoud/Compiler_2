package AST;

public class AttributeJinja extends AttributeValue {
    private final JinjaExpr expression;

    public AttributeJinja(int line, JinjaExpr expression) {
        super(line, "Jinja Value");
        this.expression = expression;
    }
    public JinjaExpr getText() {
        return expression;
    }

    @Override
    public String toString() {
        return super.name + "- \"" + expression + "\"";
    }
}
