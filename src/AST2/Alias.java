package AST2;

public class Alias extends Node{
    private final String name;
    private final String alias;
    public Alias(int line, String name, String alias) {
        super(line,"Alias");
        this.name = name;
        this.alias = alias;
    }
    public String getName() {
        return name;
    }
    public String getAlias() {
        return alias;
    }


}
