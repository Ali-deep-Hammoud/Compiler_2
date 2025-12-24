package AST;

public class JinjaStatement extends JinjaNode {
    private  final String Text;
    public JinjaStatement(int line,String Text) {
        super(line,"Jinja Statement");
        this.Text = Text;
    }
    public String getText() {
        return Text;
    }

    @Override
    public String print(String indent) {
        return indent + super.toString() + "" + this.Text + "\n";
    }
}
