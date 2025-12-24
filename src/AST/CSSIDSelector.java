package AST;

public class CSSIDSelector extends CSSSelector{
    private final String name;
    public CSSIDSelector(int line,String name) {
        super(line,"ID Selector");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString() + "- #" + name;
    }
}
