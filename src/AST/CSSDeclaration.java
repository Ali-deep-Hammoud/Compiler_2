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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.name).append("- ").append(name).append(" : ");
        for (CSSTerm term : terms) {
            stringBuilder.append(term.toString()).append(" ");
        }
        return stringBuilder.toString();
    }
}
