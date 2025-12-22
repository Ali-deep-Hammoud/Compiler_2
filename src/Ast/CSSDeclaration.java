package AST;

import java.util.ArrayList;
import java.util.List;

public class CSSDeclaration extends Node{
    private final String name;
    private final List<CSSTerm> terms;


    public CSSDeclaration(int line, String name) {
        super(line, "CSS Declaration");
        this.name = name;
        this.terms = new ArrayList<>();
    }
    public void addTerm(CSSTerm term){
        this.terms.add(term);
    }
    public void removeTerm(CSSTerm term){
        this.terms.remove(term);
    }
    public String getName() {
        return name;
    }
    public List<CSSTerm> getTerms() {
        return terms;
    }
}
