package Symbol_Table;

public class IdSymbol {
    public String name;
    public String ownerTag;
    public int line;

    public IdSymbol(String name, String ownerTag, int line) {
        this.name = name;
        this.ownerTag = ownerTag;
        this.line = line;
    }
}
