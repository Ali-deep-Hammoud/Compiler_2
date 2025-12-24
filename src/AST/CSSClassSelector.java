package AST;

public class CSSClassSelector extends CSSSelector {
    private final String name;
    public CSSClassSelector(int line,String name) {
        super(line,"Class Selector");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString() + "- ." + name;
    }
}
