package Symbol_Table;

public class SemanticError {
    private final String file;
    private final int line;
    private final int column;
    private final String message;

    public SemanticError(int line, String message) {
        this(null, line, 0, message);
    }

    public SemanticError(String file, int line, int column, String message) {
        this.file = file == null ? "<unknown>" : file;
        this.line = Math.max(0, line);
        this.column = Math.max(0, column);
        this.message = message == null ? "" : message;
    }

    public String getFile() {
        return file;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return String.format("%s:%d:%d: ERROR: %s", file, line, column, message);
    }
}
