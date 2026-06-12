package Symbol_Table;

import java.util.Objects;

public final class DataType {
    private final String name;

    public static final DataType UNKNOWN = new DataType("Unknown");
    public static final DataType ANY = new DataType("Any");
    public static final DataType INT = new DataType("int");
    public static final DataType FLOAT = new DataType("float");
    public static final DataType STRING = new DataType("string");
    public static final DataType BOOL = new DataType("bool");
    public static final DataType BOOLEAN = new DataType("boolean");
    public static final DataType LIST = new DataType("list");
    public static final DataType DICT = new DataType("dict");
    public static final DataType VOID = new DataType("void");

    public DataType(String name) {
        this.name = name == null || name.isBlank() ? UNKNOWN.name : name;
    }

    public String getName() {
        return name;
    }

    public static DataType of(String name) {
        if (name == null || name.isBlank()) {
            return UNKNOWN;
        }
        return new DataType(name);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DataType)) return false;
        DataType dataType = (DataType) o;
        return name.equals(dataType.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
