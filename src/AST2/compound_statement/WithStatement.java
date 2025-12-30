package AST2.compound_statement;

import AST2.CompoundStatement;
import AST2.Statement;

import java.util.ArrayList;
import java.util.List;

public class WithStatement extends CompoundStatement {
    private final List<WithItem> items;
    private final List<Statement> body;

    public WithStatement(int line) {
        super(line, "With Statement");
        items = new ArrayList<>();
        body = new ArrayList<>();
    }
    public void addItem(WithItem item) {
        items.add(item);
    }
    public void removeItem(WithItem item) {
        items.remove(item);
    }
    public void addBodyStatement(Statement statement) {
        body.add(statement);
    }
    public void removeBodyStatement(Statement statement) {
        body.remove(statement);
    }
    public List<Statement> getBody() {
        return body;
    }
    public List<WithItem> getItems() {
        return items;
    }
}
