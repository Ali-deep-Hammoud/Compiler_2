package Symbol_Table;

import java.util.HashMap;
import java.util.Map;

public class TagSymbol {

    public String tagName;
    public int line;
    public Map<String, String> attributes = new HashMap<>();

    public TagSymbol(String tagName, int line) {
        this.tagName = tagName;
        this.line = line;
    }

    public String key(){
        return tagName + "@" + line;
    }
    @Override
public String toString() {
    return "TagSymbol{" +
           "tagName='" + tagName + '\'' +
           ", line=" + line +
           ", attributes=" + attributes +
           '}';
}
}
