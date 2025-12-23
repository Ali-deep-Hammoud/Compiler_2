package AST;

public class AttributeString extends AttributeValue{
    private final String value;
    public AttributeString(int line, String value){
        super(line,"String Value");
        this.value=value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return super.name + "- \"" + value + "\"";
    }
}
