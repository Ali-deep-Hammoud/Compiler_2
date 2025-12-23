package AST;

public class CSSText extends CSSTerm{
    private final String text;
    public CSSText (int line,String text) {
        super(line, "CSS text");
        this.text = text;
    }
    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return super.name + "- "+ text;
    }
}
