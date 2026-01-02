package AST2.Expressions;

public class DoubleStarVariable extends Variable{
    private final String name;
    public DoubleStarVariable(int line, String name) {
        super(line,"Double Star Variable");
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
