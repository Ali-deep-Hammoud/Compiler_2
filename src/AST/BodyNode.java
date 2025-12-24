package AST;

public abstract class BodyNode extends Node {
    public BodyNode(int line,String name)
    {
        super(line,name);
    }
    public String print(String indent){

        return "";
    }
}
