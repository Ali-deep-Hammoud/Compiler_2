package AST;

public class VariableCondition extends Condition {
    private final String variable;

    public VariableCondition(int line, String variable) {
        super(line, "Variable Condition");
        this.variable = variable;
    }
    public String getVariable() {
        return variable;
    }
    @Override
    public String toString() {
        return super.name  + "- " + variable + " ";
    }
}
