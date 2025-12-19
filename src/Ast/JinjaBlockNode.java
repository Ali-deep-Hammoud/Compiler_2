package Ast;

import java.util.List;

public class JinjaBlockNode extends AstNode {

    private final String name;
    private final List<AstNode> body;
    private final boolean hasSuper;

    public JinjaBlockNode(String name, List<AstNode> body, boolean hasSuper) {
        super("JinjaBlock");
        this.name = name;
        this.body = body;
        this.hasSuper = hasSuper;
    }

    public String getName() {
        return name;
    }

    public List<AstNode> getBody() {
        return body;
    }

    public boolean hasSuper() {
        return hasSuper;
    }
}

