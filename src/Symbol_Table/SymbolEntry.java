package Symbol_Table;

public class SymbolEntry {
    private final String identifier;
    private DataType dataType;
    private SymbolKind kind;
    private final int scopeLevel;
    private long memoryOffset;
    private int size;
    private boolean initialized;
    private AccessModifier accessModifier;
    private final int declaredLine;
    private int paramCount = -1; // for functions: number of declared parameters, -1 when unknown

    public SymbolEntry(String identifier,
                       DataType dataType,
                       SymbolKind kind,
                       int scopeLevel,
                       long memoryOffset,
                       int size,
                       boolean initialized,
                       AccessModifier accessModifier,
                       int declaredLine) {
        this.identifier = identifier;
        this.dataType = dataType == null ? DataType.UNKNOWN : dataType;
        this.kind = kind == null ? SymbolKind.UNKNOWN : kind;
        this.scopeLevel = scopeLevel;
        this.memoryOffset = memoryOffset;
        this.size = Math.max(size, 0);
        this.initialized = initialized;
        this.accessModifier = accessModifier == null ? AccessModifier.NONE : accessModifier;
        this.declaredLine = declaredLine;
    }

    public String getIdentifier() {
        return identifier;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType == null ? DataType.UNKNOWN : dataType;
    }

    public SymbolKind getKind() {
        return kind;
    }

    public void setKind(SymbolKind kind) {
        this.kind = kind == null ? SymbolKind.UNKNOWN : kind;
    }

    public int getScopeLevel() {
        return scopeLevel;
    }

    public long getMemoryOffset() {
        return memoryOffset;
    }

    public void setMemoryOffset(long memoryOffset) {
        this.memoryOffset = memoryOffset;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = Math.max(size, 0);
    }

    public boolean isInitialized() {
        return initialized;
    }

    public void setInitialized(boolean initialized) {
        this.initialized = initialized;
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(AccessModifier accessModifier) {
        this.accessModifier = accessModifier == null ? AccessModifier.NONE : accessModifier;
    }

    public int getDeclaredLine() {
        return declaredLine;
    }

    public int getParamCount() {
        return paramCount;
    }

    public void setParamCount(int paramCount) {
        this.paramCount = paramCount;
    }

    @Override
    public String toString() {
        return String.format("%s | kind=%s | type=%s | scope=%d | offset=%d | size=%d | init=%s | access=%s | line=%d",
                identifier,
                kind,
                dataType,
                scopeLevel,
                memoryOffset,
                size,
                initialized ? "yes" : "no",
                accessModifier,
                declaredLine);
    }
}
