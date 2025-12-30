package AST2.small_statement;

import AST2.Alias;
import AST2.SmallStatement;

import java.util.ArrayList;
import java.util.List;

class ImportFromStatement extends SmallStatement {
    private final String module;
    private final int level;
    private final List<Alias> names;

    public ImportFromStatement(int line,String module, int level) {
        super(line, "Import From Statement");
        this.module = module;
        this.level = level;
        this.names = new ArrayList<>();
    }
    public void addAlias(Alias alias) {
        names.add(alias);
    }
    public List<Alias> getAlias() {
        return names;
    }
    public String getModule() {
        return module;
    }
    public int getLevel() {
        return level;
    }

}
