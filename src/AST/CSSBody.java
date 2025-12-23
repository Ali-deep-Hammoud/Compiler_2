package AST;

import java.util.ArrayList;
import java.util.List;

public class CSSBody extends CSSNode{
    private final List<CSSRule> cssRules;

    public CSSBody(int line) {
        super(line, "CSS Body");
        this.cssRules = new ArrayList<>();
    }
    public void addCSSRule(CSSRule cssRule){
        cssRules.add(cssRule);
    }
    public void removeCSSRule(CSSRule cssRule){
        cssRules.remove(cssRule);
    }
    public List<CSSRule> getCssRules(){
        return cssRules;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString()).append("{\n");
        for (CSSRule cssRule : cssRules) {
            stringBuilder.append(cssRule.toString());
        }
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}
