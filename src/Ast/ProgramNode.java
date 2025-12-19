package Ast;

import java.util.List;

public class ProgramNode extends AstNode{

    private final List<AstNode> body;

    public ProgramNode(List<AstNode> body) {
        super("Program");
        this.body = body;
    }

    public List<AstNode> getBody() {
        return body;
    }
}
