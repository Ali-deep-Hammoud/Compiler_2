package AST;

import java.util.ArrayList;
import java.util.List;

public class JinjaInheritance extends JinjaNode{
    private final String inheritance;
    private final List<BodyNode>  bodys;
    private final List<JinjaBlock> blocks;

    public JinjaInheritance(int line, String inheritance) {
        super(line, "Inheritance Jinja");
        this.inheritance = inheritance;
        this.blocks = new ArrayList<>();
        this.bodys = new ArrayList<>();
    }
    public void addBlock(JinjaBlock block) {
        this.blocks.add(block);
    }
    public void removeBlock(JinjaBlock block) {
        this.blocks.remove(block);
    }
    public void addBody(BodyNode body) {this.bodys.add(body);}
    public void removeBody(BodyNode body) {this.bodys.remove(body);}
    public String getInheritance() {
        return inheritance;
    }
    public List<JinjaBlock> getBlocks() {
        return blocks;
    }
    public List<BodyNode> getBodys() {return bodys;}
}
