package AST;

import java.util.ArrayList;
import java.util.List;

public class JinjaIf extends JinjaNode{
    private final Condition condition;
    private final BodyNode ifBody;
    private final List<JinjaElif> elifs;
    private final BodyNode elseBody;
    public JinjaIf(int line,Condition condition, BodyNode ifBody, BodyNode elseBody) {
        super(line, "Jinja If Statement");
        this.condition = condition;
        this.ifBody = ifBody;
        this.elseBody = elseBody;
        this.elifs = new ArrayList<JinjaElif>();
    }
    public void addElif(JinjaElif elif){
        this.elifs.add(elif);
    }
    public void removeElif(JinjaElif elif){
        this.elifs.remove(elif);
    }
    public List<JinjaElif> getElifs() {
        return elifs;
    }
    public Condition getCondition() {
        return condition;
    }
    public BodyNode getIfBody() {
        return ifBody;

    }
    public BodyNode getElseBody() {
        return elseBody;
    }
}
