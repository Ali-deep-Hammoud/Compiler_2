package AST;
import java.util.ArrayList;
import java.util.List;

public abstract class Node {

    protected final String nodeName;
    protected final int line;
    protected final List<Node> children = new ArrayList<>();

    protected Node(String nodeName, int line) {
        this.nodeName = nodeName;
        this.line = line;
    }

    public void addChild(Node child) {
        if (child != null) {
            children.add(child);
        }
    }

    public void print() {
        print("", true);
    }

    protected void print(String indent, boolean last) {
        System.out.println(
                indent +
                        (last ? "└── " : "├── ") +
                        nodeName +
                        " (line " + line + ")"
        );

        for (int i = 0; i < children.size(); i++) {
            children.get(i).print(
                    indent + (last ? "    " : "│   "),
                    i == children.size() - 1
            );
        }
    }
}
