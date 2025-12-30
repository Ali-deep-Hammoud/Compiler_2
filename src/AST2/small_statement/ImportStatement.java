package AST2.small_statement;

import AST2.Alias;
import AST2.SmallStatement;

import java.util.ArrayList;
import java.util.List;

public class ImportStatement extends SmallStatement {
    private final List<Alias> names;

    public ImportStatement(int line) {
        super(line, "Import Statement");
        this.names = new ArrayList<>();
    }
    public void addAlias(Alias alias) {
        names.add(alias);
    }
    public void removeAlias(Alias alias) {
        names.remove(alias);
    }
    public List<Alias> getNames() {
        return names;
    }

}
