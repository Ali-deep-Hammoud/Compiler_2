package AST;

public abstract class Node {
    public int line;
    public String name;

    public Node(int line, String name ) {
        this.line = line;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.line + "- " + this.name + " ";
    }
}

