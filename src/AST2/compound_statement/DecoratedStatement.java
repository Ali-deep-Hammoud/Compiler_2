package AST2.compound_statement;

import AST2.CompoundStatement;

import java.util.ArrayList;
import java.util.List;

public class DecoratedStatement extends CompoundStatement {
    private final List<Decorator> decorators;
    private final FunctionStatement function;
    private final ClassStatement classStatement;

    public DecoratedStatement(int line, ClassStatement classStatement) {
        super(line,"Decorated Class");
        this.decorators = new ArrayList<>();
        this.function = null;
        this.classStatement = classStatement;
    }
    public DecoratedStatement(int line, FunctionStatement function) {
        super(line,"Decorated Function");
        this.decorators = new ArrayList<>();
        this.function = function;
        this.classStatement = null;
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
    public ClassStatement getaClass() {
        return classStatement;
    }
}
