package AST;

import java.util.ArrayList;
import java.util.List;

public class HTMLElement extends HTMLNode{
    private final String tag;
    private final List<Attribute> attributes;
    private final List<BodyNode> children;

    public HTMLElement(int line,String tag) {
        super(line,"HTML Element");
        this.tag = tag;
        attributes = new ArrayList<Attribute>();
        children = new ArrayList<>();
    }
    public void addAttribute(Attribute attribute){
        attributes.add(attribute);
    }
    public void removeAttribute(Attribute attribute){
        attributes.remove(attribute);
    }
    public void addChild(BodyNode body){
        children.add(body);
    }
    public void removeChild(BodyNode body){
        children.remove(body);
    }

    public String getTag() {
        return tag;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public List<BodyNode> getChildren() {
        return children;
    }
}
