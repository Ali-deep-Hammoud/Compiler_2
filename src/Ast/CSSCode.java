package AST;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CSSCode extends CSSNode{
    private final List<CSSRule> rules;

    public CSSCode(int line) {
        super(line, "CSS");
        this.rules = new ArrayList<>();
    }
    public void addRule(CSSRule rule){
        rules.add(rule);
    }
    public void removeRule(CSSRule rule){
        rules.remove(rule);
    }
    public List<CSSRule> getRules() {
        return rules;
    }
}
