package AST;

public class JinjaStatement extends JinjaNode {
    private  final String text;
    public JinjaStatement(int line,String Text) {
        super(line,"Jinja Statement");
        this.text = Text;
    }
    public String getText() {
        return text;
    }

    @Override
    public String print(String indent) {
        return indent + super.toString() + "" + this.text + "\n";
    }

}
