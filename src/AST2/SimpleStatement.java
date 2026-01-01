package AST2;

import java.util.ArrayList;
import java.util.List;

public class SimpleStatement extends Statement {
    List<SmallStatement> statements;

    public SimpleStatement(int line) {
        super(line, "Simple Statement");
        this.statements = new ArrayList<>();
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

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append(" {\n");
        String indentation = indent + "\t";
        for (SmallStatement statement : statements) {
            sb.append(statement.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();

    }
}
