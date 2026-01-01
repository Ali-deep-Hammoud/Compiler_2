package AST2.compound_statement;

import AST2.Expr;
import AST2.Node;

import java.util.ArrayList;
import java.util.List;

public class Decorator extends Node {
    private final String name;
    private final List<Expr> args;

    public Decorator(int line, String name) {
        super(line, "Decorator");
        this.name = name;
        this.args = new ArrayList<>();
    }
    public void addArg(Expr arg) {
        this.args.add(arg);
    }
    public void removeArg(Expr arg) {
        this.args.remove(arg);
    }
    public String getName() {
        return name;
    }
    public List<Expr> getArgs() {
        return args;
    }
}
