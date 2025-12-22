package AST;

public class JinjaFor extends JinjaNode{
    private final String itemName;
    private final String collectionName;
    private final Condition filterCondition;
    private final BodyNode body;
    private final BodyNode elseBody;

    public JinjaFor(int line, String itemName, String collectionName,
                        Condition filterCondition, BodyNode body, BodyNode elseBody) {
        super(line, "Jinja For Loop");
        this.itemName = itemName;
        this.collectionName = collectionName;
        this.filterCondition = filterCondition;
        this.body = body;
        this.elseBody = elseBody;
    }

    public String getItemName() { return itemName; }
    public String getCollectionName() { return collectionName; }
    public Condition getFilterCondition() { return filterCondition; }
    public BodyNode getBody() { return body; }
    public BodyNode getElseBody() { return elseBody; }
}
