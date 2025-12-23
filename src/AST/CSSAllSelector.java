package AST;

public class CSSAllSelector extends CSSSelector {

    public CSSAllSelector(int line) {
        super(line, "All Selector");
    }

    @Override
    public String toString() {
        return super.name + "- *";
    }
}
