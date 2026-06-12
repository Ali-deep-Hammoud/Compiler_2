package Symbol_Table;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class SymbolTable {
    private final Scope globalScope;
    private Scope currentScope;

    public SymbolTable() {
        this.globalScope = new Scope("global", 0, null);
        this.currentScope = globalScope;
    }

    public Scope getGlobalScope() {
        return globalScope;
    }

    public Scope getCurrentScope() {
        return currentScope;
    }

    public int getCurrentScopeLevel() {
        return currentScope.getLevel();
    }

    public void enterScope(String scopeName) {
        Objects.requireNonNull(scopeName, "Scope name may not be null");
        Scope child = new Scope(scopeName, currentScope.getLevel() + 1, currentScope);
        currentScope = child;
    }

    public void exitScope() {
        if (currentScope.getParent() != null) {
            currentScope = currentScope.getParent();
        }
    }

    public boolean insertSymbol(SymbolEntry entry) {
        Objects.requireNonNull(entry, "Symbol entry may not be null");
        if (currentScope.contains(entry.getIdentifier())) {
            return false;
        }
        long offset = currentScope.allocateOffset(entry.getSize());
        entry.setMemoryOffset(offset);
        currentScope.define(entry);
        return true;
    }

    public SymbolEntry lookupCurrentScope(String identifier) {
        if (identifier == null) {
            return null;
        }
        return currentScope.resolveLocal(identifier);
    }

    public SymbolEntry lookupAllScopes(String identifier) {
        if (identifier == null) {
            return null;
        }
        Scope scope = currentScope;
        while (scope != null) {
            SymbolEntry entry = scope.resolveLocal(identifier);
            if (entry != null) {
                return entry;
            }
            scope = scope.getParent();
        }
        return null;
    }

    public boolean updateSymbol(String identifier,
                                DataType dataType,
                                Boolean initialized,
                                AccessModifier accessModifier) {
        SymbolEntry entry = lookupAllScopes(identifier);
        if (entry == null) {
            return false;
        }
        if (dataType != null) {
            entry.setDataType(dataType);
        }
        if (initialized != null) {
            entry.setInitialized(initialized);
        }
        if (accessModifier != null) {
            entry.setAccessModifier(accessModifier);
        }
        return true;
    }

    public boolean deleteSymbol(String identifier) {
        if (identifier == null) {
            return false;
        }
        return currentScope.remove(identifier) != null;
    }

    public String printSymbolTable() {
        List<SymbolEntry> symbols = collectAllSymbols();
        String[] headers = {"Identifier", "DataType", "Kind", "ScopeLevel", "Offset", "Size", "Initialized", "Access", "Line"};

        int[] widths = new int[headers.length];
        for (int i = 0; i < headers.length; i++) {
            widths[i] = headers[i].length();
        }

        for (SymbolEntry entry : symbols) {
            widths[0] = Math.max(widths[0], entry.getIdentifier().length());
            widths[1] = Math.max(widths[1], entry.getDataType().toString().length());
            widths[2] = Math.max(widths[2], entry.getKind().toString().length());
            widths[3] = Math.max(widths[3], Integer.toString(entry.getScopeLevel()).length());
            widths[4] = Math.max(widths[4], Long.toString(entry.getMemoryOffset()).length());
            widths[5] = Math.max(widths[5], Integer.toString(entry.getSize()).length());
            widths[6] = Math.max(widths[6], entry.isInitialized() ? "yes".length() : "no".length());
            widths[7] = Math.max(widths[7], entry.getAccessModifier().toString().length());
            widths[8] = Math.max(widths[8], Integer.toString(entry.getDeclaredLine()).length());
        }

        StringBuilder sb = new StringBuilder();
        sb.append("=== Symbol Table ===\n");

        for (int i = 0; i < headers.length; i++) {
            sb.append(String.format("%-" + (widths[i] + 2) + "s", headers[i]));
        }
        sb.append("\n");

        for (int width : widths) {
            sb.append("-".repeat(width + 2));
        }
        sb.append("\n");

        for (SymbolEntry entry : symbols) {
            sb.append(String.format("%-" + (widths[0] + 2) + "s", entry.getIdentifier()));
            sb.append(String.format("%-" + (widths[1] + 2) + "s", entry.getDataType()));
            sb.append(String.format("%-" + (widths[2] + 2) + "s", entry.getKind()));
            sb.append(String.format("%-" + (widths[3] + 2) + "s", entry.getScopeLevel()));
            sb.append(String.format("%-" + (widths[4] + 2) + "s", entry.getMemoryOffset()));
            sb.append(String.format("%-" + (widths[5] + 2) + "s", entry.getSize()));
            sb.append(String.format("%-" + (widths[6] + 2) + "s", entry.isInitialized() ? "yes" : "no"));
            sb.append(String.format("%-" + (widths[7] + 2) + "s", entry.getAccessModifier()));
            sb.append(String.format("%-" + (widths[8] + 2) + "s", entry.getDeclaredLine()));
            sb.append("\n");
        }

        if (symbols.isEmpty()) {
            sb.append("(no symbols found)\n");
        }

        return sb.toString();
    }

    public List<SymbolEntry> collectAllSymbols() {
        List<SymbolEntry> symbols = new ArrayList<>();
        collectScopeSymbols(globalScope, symbols);
        return Collections.unmodifiableList(symbols);
    }

    private void collectScopeSymbols(Scope scope, List<SymbolEntry> destination) {
        destination.addAll(scope.getSymbols());
        for (Scope child : scope.getChildren()) {
            collectScopeSymbols(child, destination);
        }
    }
}
