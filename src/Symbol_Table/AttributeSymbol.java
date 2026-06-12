package Symbol_Table;

public class AttributeSymbol {
    public String name;
    public String value;
    public int line;

    public AttributeSymbol(String name, String value, int line) {
        this.name = name;
        this.value = value;
        this.line = line;
    }
    @Override
public String toString() {
    return "AttributeSymbol{" +
           "name='" + name + '\'' +
           ", value='" + value + '\'' +
           ", line=" + line +
           '}';
}
}
