
package AST2.small_statement;

import AST2.SmallStatement;

import java.util.ArrayList;
import java.util.List;

public class NonLocalStatement extends SmallStatement {
    private final List<String> names;

    public NonLocalStatement(int line) {
        super(line, "None Locale Statement");
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
