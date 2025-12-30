package AST2.compound_statement;

import AST2.CompoundStatement;
import AST2.Expr;
import AST2.Statement;

import java.util.ArrayList;
import java.util.List;

public class Class extends CompoundStatement {
    private final List<Expr> base;
    private final List<Statement> body;

    public Class(int line) {
        super(line, "Class");
        this.base = new ArrayList<>();
        this.body = new ArrayList<>();
    }
    public void addBase(Expr expr) {
        this.base.add(expr);
    }
    public void addBodyStatement(Statement statement) {
        this.body.add(statement);
    }
    public void removeBodyStatement(Statement statement) {
        this.body.remove(statement);
    }
    public void removeBase(Expr expr) {
        this.base.remove(expr);
    }
    public List<Expr> getBase() {
        return this.base;
    }
    public List<Statement> getBody() {
        return this.body;
    }
}

