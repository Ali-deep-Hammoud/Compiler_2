package AST;

public class JinjaAssign extends JinjaExpr{
    private final JinjaText name;
    private final JinjaExpr value;
    public JinjaAssign(int line, JinjaText name, JinjaExpr value) {
        super(line, "Jinja Assign");
        this.name = name;
        this.value = value;
    }

    public JinjaExpr getValue() {
        return value;
    }

    public JinjaText getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.name+ "- "+  name.toString()+" = "+value.toString() + " ";
    }
}
