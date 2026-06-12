package IR;

public enum OpCode {
    // data movement
    LOAD_CONST,
    LOAD_VAR,
    STORE_VAR,
    // calls & control flow
    CALL,
    RETURN,
    LABEL,
    GOTO,
    IF_FALSE_GOTO,
    // functions
    FUNC_BEGIN,
    FUNC_END,
    // binary ops
    BINOP,
    // HTML / Jinja target ops
    HTML_TEXT,
    HTML_TAG_OPEN,
    HTML_TAG_CLOSE,
    HTML_VOID_TAG,
    JINJA_EXPR,
    JINJA_FOR_BEGIN,
    JINJA_FOR_END,
    JINJA_IF_BEGIN,
    JINJA_IF_END,
    COMMENT
}
