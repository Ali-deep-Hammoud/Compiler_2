package AST2.compound_statement;

import AST2.CompoundStatement;
import AST2.Statement;

import java.util.ArrayList;
import java.util.List;

public class WithStatement extends CompoundStatement {
    private final List<WithItem> items;
    private final Body body;

    public WithStatement(int line,Body body) {
        super(line, "With Statement");
        this.items = new ArrayList<>();
        this.body = body;
    }
    public void addItem(WithItem item) {
        items.add(item);
    }
    public void removeItem(WithItem item) {
        items.remove(item);
    }

    public Body getBody() {
        return body;
    }
    public List<WithItem> getItems() {
        return items;
    }
}
