
package AST2.compound_statement;

import AST2.Expr;
import AST2.Node;

public class StarParameter extends Parameter {
    private final String name;
    private final Expr type;


    public StarParameter(int line,String name, Expr type) {
        super(line,"Parameter");
        this.name = name;
        this.type = type;
    }
    public Expr getType() {
        return type;
    }
    public String getName() {
        return name;
    }
    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.print(indent)).append("{\n");
        String indentation = indent + "\t";


        if (type != null) {
            sb.append(type.print(indentation)).append("\n");
        }
        sb.append(indent).append("}");
        return sb.toString();
    }
}
