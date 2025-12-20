package Ast;

import org.stringtemplate.v4.ST;

public abstract class AstNode {
    private final String type;

    public AstNode(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
