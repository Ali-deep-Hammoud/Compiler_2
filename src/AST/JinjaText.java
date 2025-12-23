package AST;

public class JinjaText extends JinjaExpr{
    private final String text;
    public JinjaText(int line, String text) {
        super(line, "Jinja Expr");
        this.text = text;
    }
    public String getText() {
        return text;
    }
}
