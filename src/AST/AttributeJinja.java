package AST;

public class AttributeJinja extends AttributeValue {
    private final JinjaExpression expression;

    public AttributeJinja(int line, JinjaExpression expression) {
        super(line, "Jinja Value");
        this.expression = expression;
    }
    public JinjaExpression getText() {
        return expression;
    }

    @Override
    public String toString() {
        return super.name + "- \"" + expression.toString() + "\"";
    }
}
