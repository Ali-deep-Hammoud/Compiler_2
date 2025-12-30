package AST2.compound_statement;

import AST2.CompoundStatement;
import AST2.Expr;

import java.util.ArrayList;
import java.util.List;

public class DecoratedStatement extends CompoundStatement {
    private final List<Decorator> decorators;
    private final FunctionStatement function;
    private final Class aClass;

    public DecoratedStatement(int line, Class aClass) {
        super(line,"Decorated Class");
        this.decorators = new ArrayList<>();
        this.function = null;
        this.aClass = aClass;
    }
    public DecoratedStatement(int line, FunctionStatement function) {
        super(line,"Decorated Function");
        this.decorators = new ArrayList<>();
        this.function = function;
        this.aClass = null;
    }

    public void addDecorator(Decorator decorator) {
        this.decorators.add(decorator);
    }
    public void removeDecorator(Decorator decorator) {
        this.decorators.remove(decorator);
    }
    public List<Decorator> getDecorators() {
        return decorators;
    }
    public FunctionStatement getFunction() {
        return function;
    }
    public Class getaClass() {
        return aClass;
    }
}
