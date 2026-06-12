package Symbol_Table;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Scope {
    private final String name;
    private final int level;
    private final Scope parent;
    private final Map<String, SymbolEntry> symbols = new LinkedHashMap<>();
    private final List<Scope> children = new ArrayList<>();
    private long nextOffset = 0;

    public Scope(String name, int level, Scope parent) {
        this.name = name == null ? "anonymous" : name;
        this.level = level;
        this.parent = parent;
        if (parent != null) {
            parent.children.add(this);
        }
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public Scope getParent() {
        return parent;
    }

    public List<Scope> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void define(SymbolEntry entry) {
        symbols.put(entry.getIdentifier(), entry);
    }

    public SymbolEntry resolveLocal(String identifier) {
        return symbols.get(identifier);
    }

    public boolean contains(String identifier) {
        return symbols.containsKey(identifier);
    }

    public SymbolEntry remove(String identifier) {
        return symbols.remove(identifier);
    }

    public int size() {
        return symbols.size();
    }

    public long allocateOffset(int size) {
        long offset = nextOffset;
        nextOffset += Math.max(size, 0);
        return offset;
    }

    public List<SymbolEntry> getSymbols() {
        return new ArrayList<>(symbols.values());
    }

    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Scope: ").append(name).append(" (level=").append(level).append(")\n");
        String childIndent = indent + "  ";

        if (symbols.isEmpty()) {
            sb.append(childIndent).append("(no symbols)\n");
        } else {
            for (SymbolEntry entry : symbols.values()) {
                sb.append(childIndent).append("- ").append(entry).append("\n");
            }
        }

        for (Scope child : children) {
            sb.append(child.print(childIndent));
        }
        return sb.toString();
    }
}
