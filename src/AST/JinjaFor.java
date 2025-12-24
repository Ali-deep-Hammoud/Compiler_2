package AST;

public class JinjaFor extends JinjaNode{
    private final JinjaText itemName;
    private final JinjaText collectionName;
    private final Condition filterCondition;
    private final BodyNode body;
    private final BodyNode elseBody;

    public JinjaFor(int line, JinjaText itemName, JinjaText collectionName,
                        Condition filterCondition, BodyNode body, BodyNode elseBody) {
        super(line, "Jinja For Loop");
        this.itemName = itemName;
        this.collectionName = collectionName;
        this.filterCondition = filterCondition;
        this.body = body;
        this.elseBody = elseBody;
    }

    public JinjaText getItemName() { return itemName; }
    public JinjaText getCollectionName() { return collectionName; }
    public Condition getFilterCondition() { return filterCondition; }
    public BodyNode getBody() { return body; }
    public BodyNode getElseBody() { return elseBody; }

    @Override
    public String print(String indent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(indent).append(super.toString()).append("{\n");
        stringBuilder.append(indent).append("loop: ").append(itemName.getText()).append(" in ").append(collectionName.getText()).append("\n");
        if(filterCondition != null) {
            stringBuilder.append(indent).append("Condition: ").append(filterCondition).append("\n");
        }
        String indentation = indent + "\t";
        if(body != null) {
            stringBuilder.append(indent).append("body: ").append("\n");
            stringBuilder.append(body.print(indentation));
        }
        if(elseBody != null) {
            stringBuilder.append(indent).append("Else body: ").append("\n");
            stringBuilder.append(elseBody.print(indentation));
        }
        stringBuilder.append(indent).append("\n");
        stringBuilder.append(indent).append("}\n");
        return stringBuilder.toString();
    }
}
