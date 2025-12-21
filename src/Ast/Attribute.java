package AST;

public class Attribute extends Node{
    private final String name;
    private final String value;

    public Attribute(int line,String name) {
        super(line, "Attribute");
        this.name = name;
        this.value = null;
    }
    public Attribute(int line,String name, String value) {
        super(line, "Attribute");
        this.name = name;
        this.value = value;
    }

}
