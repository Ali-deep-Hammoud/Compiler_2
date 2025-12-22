package AST;

import java.util.ArrayList;
import java.util.List;

public class jinjaInheritance extends JinjaNode{
    private final String inheritance;
    private final List<JinjaBlock> blocks;

    public jinjaInheritance(int line, String inheritance) {
        super(line, "Inheritance Jinja");
        this.inheritance = inheritance;
        this.blocks = new ArrayList<>();
    }
    public void addBlock(JinjaBlock block) {
        this.blocks.add(block);
    }
    public void removeBlock(JinjaBlock block) {
        this.blocks.remove(block);
    }
    public String getInheritance() {
        return inheritance;
    }
    public List<JinjaBlock> getBlocks() {
        return blocks;
    }
}
