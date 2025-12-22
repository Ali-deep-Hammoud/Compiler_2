package AST;

public class JinjaAssign extends JinjaExpr{
    private final String name;
    private final JinjaExpr value;
    public JinjaAssign(int line, String name, JinjaExpr value) {
        super(line, "Jinja Assign");
        this.name = name;
        this.value = value;
    }

    public JinjaExpr getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
