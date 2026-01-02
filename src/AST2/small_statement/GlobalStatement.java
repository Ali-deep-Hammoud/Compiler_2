package AST2.small_statement;

import AST2.Alias;
import AST2.SmallStatement;

import java.util.ArrayList;
import java.util.List;

public class GlobalStatement extends SmallStatement {
    private final List<String> names;

    public GlobalStatement(int line) {
        super(line, "Global Statement");
        names = new ArrayList<>();
    }
    public void addName(String name){
        names.add(name);
    }
    public void removeName(String name){
        names.remove(name);
    }

    public List<String> getNames() {
        return names;
    }

}
