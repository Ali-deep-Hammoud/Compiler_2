package AST;

import java.util.ArrayList;
import java.util.List;

public class Program extends Node{
    private final List<BodyNode> bodyNodes;
    public Program(int line) {
        super(line, "Program");
        this.bodyNodes = new ArrayList<BodyNode>();
    }
    public void addBodyNode(BodyNode bodyNode){
        this.bodyNodes.add(bodyNode);
    }
    public void removeBodyNode(BodyNode bodyNode){
        this.bodyNodes.remove(bodyNode);
    }
    public List<BodyNode> getBodyNodes(){
        return this.bodyNodes;
    }
}
