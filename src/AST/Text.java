package AST;

public class Text extends BodyNode{
    private final String text;
    public Text(int line,String text) {
        super(line,"Text");
        this.text = text.replaceAll("^['\"]|['\"]$", "");

    }
    public String getText() {
        return text;
    }

    @Override
    public String print(String indent) {
        return indent +super.name+ "- " + text + "\n";
    }
}
