package Symbol_Table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HtmlSymbolTable {

    public final Map<String, TagSymbol> tags = new HashMap<>();
    public final Map<String, IdSymbol> ids = new HashMap<>();
    public final Map<String, List<TagSymbol>> classes = new HashMap<>();
    public final List<AttributeSymbol> attributes = new ArrayList<>();
    public final Set<String> jinjaVariables = new LinkedHashSet<>();

    public void addTag(TagSymbol tag) {
        tags.put(tag.key(), tag);
    }

    public void addId(IdSymbol id) {
        ids.put(id.name, id);
    }

    public void addClass(String className, TagSymbol owner) {
        classes.computeIfAbsent(className, k -> new ArrayList<>()).add(owner);
    }

    public void addAttribute(AttributeSymbol attr) {
        attributes.add(attr);
    }

    public void addJinjaVariable(String name, int line) {
        if (name != null && !name.isBlank()) {
            jinjaVariables.add(name);
        }
    }
}
