package IR;

public class IRInstruction {
    private final OpCode op;
    private final String arg1;
    private final String arg2;
    private final String result;
    private final int sourceLine;

    public IRInstruction(OpCode op, String arg1, String arg2, String result, int sourceLine) {
        this.op = op;
        this.arg1 = arg1 == null ? "" : arg1;
        this.arg2 = arg2 == null ? "" : arg2;
        this.result = result == null ? "" : result;
        this.sourceLine = Math.max(0, sourceLine);
    }

    public static IRInstruction of(OpCode op, int line) {
        return new IRInstruction(op, "", "", "", line);
    }

    public static IRInstruction of(OpCode op, String arg1, int line) {
        return new IRInstruction(op, arg1, "", "", line);
    }

    public static IRInstruction of(OpCode op, String arg1, String arg2, String result, int line) {
        return new IRInstruction(op, arg1, arg2, result, line);
    }

    public OpCode getOp() {
        return op;
    }

    public String getArg1() {
        return arg1;
    }

    public String getArg2() {
        return arg2;
    }

    public String getResult() {
        return result;
    }

    public int getSourceLine() {
        return sourceLine;
    }

    @Override
    public String toString() {
        return switch (op) {
            case LOAD_CONST -> result + " = const " + arg1 + "  ; line " + sourceLine;
            case LOAD_VAR -> result + " = load " + arg1 + "  ; line " + sourceLine;
            case STORE_VAR -> "store " + arg1 + " = " + arg2 + "  ; line " + sourceLine;
            case CALL -> result + " = call " + arg1 + "(" + arg2 + ")  ; line " + sourceLine;
            case RETURN -> "return " + arg1 + "  ; line " + sourceLine;
            case LABEL -> arg1 + ":";
            case GOTO -> "goto " + arg1 + "  ; line " + sourceLine;
            case IF_FALSE_GOTO -> "if_false " + arg1 + " goto " + arg2 + "  ; line " + sourceLine;
            case FUNC_BEGIN -> "func_begin " + arg1 + "  ; line " + sourceLine;
            case FUNC_END -> "func_end " + arg1 + "  ; line " + sourceLine;
            case BINOP -> {
                String[] parts = arg2.split(":", 2);
                String operator = parts.length > 0 ? parts[0] : "";
                String right = parts.length > 1 ? parts[1] : "";
                yield result + " = " + arg1 + " " + operator + " " + right + "  ; line " + sourceLine;
            }
            case HTML_TEXT -> "html_text " + arg1;
            case HTML_TAG_OPEN -> "html_open <" + arg1 + "> attrs={" + arg2 + "}";
            case HTML_TAG_CLOSE -> "html_close </" + arg1 + ">";
            case HTML_VOID_TAG -> "html_void <" + arg1 + "> attrs={" + arg2 + "}";
            case JINJA_EXPR -> "jinja_expr {{" + arg1 + "}}";
            case JINJA_FOR_BEGIN -> "jinja_for " + arg1 + " in " + arg2;
            case JINJA_FOR_END -> "jinja_endfor";
            case JINJA_IF_BEGIN -> "jinja_if " + arg1;
            case JINJA_IF_END -> "jinja_endif";
            case COMMENT -> "; " + arg1;
        };
    }
}
