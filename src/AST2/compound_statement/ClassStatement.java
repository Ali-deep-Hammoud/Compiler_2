package AST2.compound_statement;

import AST2.CompoundStatement;
import AST2.Expr;
import AST2.Statement;

import java.util.ArrayList;
import java.util.List;

public class ClassStatement extends CompoundStatement {
    private final String name;
    private final List<Expr> base;
    private final Body body;

    public ClassStatement(int line, String name, Body body) {
        super(line, "Class");
        this.name = name;
        this.base = new ArrayList<>();
        this.body = body;
    }
    public void addBase(Expr expr) {
        this.base.add(expr);
    }

    public void removeBase(Expr expr) {
        this.base.remove(expr);
    }
    public List<Expr> getBase() {
        return this.base;
    }
    public Body getBody() {
        return this.body;
    }

    public String getName() {
        return name;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (!base.isEmpty()) {
            for (Expr expr : base) {
                sb.append(expr.print(indentation)).append("\n");
            }
        }
        if (body != null) {
            sb.append(body.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}

