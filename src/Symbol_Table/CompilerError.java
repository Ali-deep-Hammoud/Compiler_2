package Symbol_Table;

public class CompilerError {
    public enum Severity { ERROR, WARNING, INFO }

    private final String file;
    private final int line;
    private final int column;
    private final Severity severity;
    private final String message;

    public CompilerError(String file, int line, int column, Severity severity, String message) {
        this.file = file == null ? "<unknown>" : file;
        this.line = Math.max(0, line);
        this.column = Math.max(0, column);
        this.severity = severity == null ? Severity.ERROR : severity;
        this.message = message == null ? "" : message;
    }

    public String getFile() { return file; }
    public int getLine() { return line; }
    public int getColumn() { return column; }
    public Severity getSeverity() { return severity; }
    public String getMessage() { return message; }

    @Override
    public String toString() {
        return String.format("%s:%d:%d: %s: %s", file, line, column, severity, message);
    }
}
