package AST2;

import java.util.ArrayList;
import java.util.List;

public class Program extends Node{
    List<Statement> statements;
    public Program(int line){
        super(line, "Program");
        this.statements = new ArrayList<>();
    }
    public void addStatement(Statement statement){
        this.statements.add(statement);
    }
    public void removeStatement(Statement statement){
        this.statements.remove(statement);
    }
    public List<Statement> getStatements(){
        return this.statements;
    }

}
