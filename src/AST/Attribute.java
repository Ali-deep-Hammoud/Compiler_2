package AST;

public class Attribute extends Node{
    private final String name;
    private final AttributeValue value;

    public Attribute(int line,String name) {
        super(line, "Attribute");
        this.name = name;
        this.value = null;
    }
    public Attribute(int line,String name, AttributeValue value) {
        super(line, "Attribute");
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.name).append("- ").append(name);
        if(value != null){
            stringBuilder.append(" : ").append(value);
        }
        return stringBuilder.toString();
    }
}
