package AST;

public class CSSNormalSelector extends CSSSelector {
    private final String name;
    public CSSNormalSelector(int line, String name) {
        super(line, "Normal Selector");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.name + "- " + name;
    }
}
