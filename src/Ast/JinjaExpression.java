package AST;

public class JinjaExpression extends JinjaNode{
    private final JinjaExpr expression;

    public JinjaExpression(int line, JinjaExpr expression) {
        super(line, "Jinja Expression");
        this.expression = expression;
    }
    public JinjaExpr getText() {
        return expression;
    }
}
