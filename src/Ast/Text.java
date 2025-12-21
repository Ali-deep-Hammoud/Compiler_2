package AST;

public class Text extends Node{
    private final String text;
    public Text(int line,String text) {
        super(line,"Text");
        this.text = text;
    }
    public String getText() {
        return text;
    }
}
