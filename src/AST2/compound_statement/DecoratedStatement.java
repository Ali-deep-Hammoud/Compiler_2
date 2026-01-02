package AST2.compound_statement;

import AST2.CompoundStatement;
import AST2.Expr;

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
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";

        if (!decorators.isEmpty()) {
            for (Decorator decorator : decorators) {
                sb.append(decorator.print(indentation)).append("\n");
            }
        }
        if (function != null) {
            sb.append(function.print(indentation)).append("\n");
        }
        if (classStatement != null) {
            sb.append(classStatement.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}
