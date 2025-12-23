package AST;

import java.util.ArrayList;
import java.util.List;

public class JinjaFunction extends JinjaExpr {
    private final String name;
    private final List<JinjaExpr> arguments;
    public JinjaFunction(int line,String name) {
        super(line,"Jinja Function");
        this.name = name;
        this.arguments = new ArrayList<>();
    }
    public void addArgument(JinjaExpr argument){
        this.arguments.add(argument);
    }
    public void removeArgument(JinjaExpr argument){
        this.arguments.remove(argument);
    }

    public String getName() {
        return name;
    }

    public List<JinjaExpr> getArguments() {
        return arguments;
    }
}
