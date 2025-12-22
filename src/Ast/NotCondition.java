package AST;

public class NotCondition extends Condition {
    private final Condition condition;

    public NotCondition(int line, Condition condition) {
        super(line, "Not Condition");
        this.condition = condition;
    }
    public Condition getCondition() {
        return condition;
    }
}
