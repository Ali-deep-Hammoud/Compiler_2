package AST;

public class Selector extends Node{
    private final String name;

    public Selector(int line, String name) {
        super(line, "Selector");
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
