package AST2;

public abstract class Node {
    int line;
    String name;
    public Node(int line, String name) {
        this.line = line;
        this.name = name;
    }
    public String print(String indent){
        return "line- " + this.line + " | name- " + this.name + " ";
    }
}
