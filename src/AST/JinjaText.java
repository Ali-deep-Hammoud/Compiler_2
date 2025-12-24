package AST;

public class JinjaText extends JinjaExpr{
    private final String text;
    public JinjaText(int line, String text) {
        super(line, "Jinja Text");
        this.text = text.replaceAll("^['\"]|['\"]$", "");
    }
    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return super.name+ "- " + text + " ";
    }
}
