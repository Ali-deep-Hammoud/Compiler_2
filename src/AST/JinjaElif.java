package AST;

public class JinjaElif extends JinjaNode {
    private final Condition condition;
    private final BodyNode body;

    public JinjaElif(int line,Condition condition, BodyNode body ) {
        super(line, "Elif Statement");
        this.condition = condition;
        this.body = body;
    }
    public Condition getCondition() {
        return condition;
    }
    public BodyNode getBody() {
        return body;
    }
}
