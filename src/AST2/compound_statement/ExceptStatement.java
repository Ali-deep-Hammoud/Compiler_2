package AST2.compound_statement;

import AST2.Expr;
import AST2.Node;
import AST2.Statement;

import java.util.ArrayList;
import java.util.List;

public class ExceptStatement extends Node {
    private final Expr type;
    private final String name;
    private final Body body;

    public ExceptStatement(int line,Expr type, String name,Body body) {
        super(line,"Except Statement");
        this.type = type;
        this.name = name;
        this.body = body;
    }

    public Body getBody() {
        return body;
    }
    public Expr getType() {
        return type;
    }
    public String getName() {
        return name;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (type != null) {
            sb.append(type.print(indentation)).append("\n");
        }
        if (body != null) {
            sb.append(body.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}
