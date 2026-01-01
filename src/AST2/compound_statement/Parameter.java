package AST2.compound_statement;

import AST2.Node;

public abstract class Parameter extends Node {

    public Parameter(int line, String name) {
        super(line, name);
    }
}