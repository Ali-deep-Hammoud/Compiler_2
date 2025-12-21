package AST;

import java.util.ArrayList;
import java.util.List;

public class HTMLElement extends HTMLNode{
    private final String tag;
    private final List<Attribute> attributes;
    private final List<Node> children;

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
    public void addChild(Node node){
        children.add(node);
    }
    public void removeChild(Node node){
        children.remove(node);
    }

    public String getTag() {
        return tag;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public List<Node> getChildren() {
        return children;
    }
}
