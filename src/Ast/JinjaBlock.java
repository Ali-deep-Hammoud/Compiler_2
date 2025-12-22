package AST;

import java.util.ArrayList;
import java.util.List;

public class JinjaBlock extends JinjaNode{
    private final JinjaSuperBlock superBlock;
    private final String name;
    private final List<BodyNode> bodys;

    public JinjaBlock(int line, String name,JinjaSuperBlock superBlock) {
        super(line, "Jinja Block");
        this.name = name;
        this.bodys = new ArrayList<>() ;
        this.superBlock = superBlock;
    }
    public JinjaBlock(int line, String name) {
        super(line, "Jinja Block");
        this.name = name;
        this.bodys = new ArrayList<>();
        this.superBlock = null;
    }
    public void addBody(BodyNode body) {
        this.bodys.add(body);
    }
    public void removeBody(BodyNode body) {
        this.bodys.remove(body);
    }
    public String getName() {
        return name;
    }
    public List<BodyNode> getBodys() {
        return bodys;
    }
    public JinjaSuperBlock getSuperBlock() {
        return superBlock;
    }
}
