package AST2;

import java.util.List;

public class SimpleStatement extends Statement {
    List<SmallStatement> statements;

    public SimpleStatement(int line) {
        super(line, "Simple Statement");
    }
    public void addStatement(SmallStatement statement) {
        statements.add(statement);
    }
    public void removeStatement(SmallStatement statement) {
        statements.remove(statement);
    }
    public List<SmallStatement> getStatements() {
        return statements;
    }
}
