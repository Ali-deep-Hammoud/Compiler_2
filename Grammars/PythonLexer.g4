lexer grammar PythonLexer;

@lexer::members {
    private int bracketLevel = 0;
}

// ==========================================
// KEYWORDS
// ==========================================
DEF       : 'def';
CLASS     : 'class';
IF        : 'if';
ELIF      : 'elif';
ELSE      : 'else';
FOR       : 'for';
WHILE     : 'while';
RETURN    : 'return';
IMPORT    : 'import';
FROM      : 'from';
AS        : 'as';
IN        : 'in';
IS        : 'is';
AND       : 'and';
OR        : 'or';
NOT       : 'not';
PASS      : 'pass';
BREAK     : 'break';
CONTINUE  : 'continue';
WITH      : 'with';
TRY       : 'try';
EXCEPT    : 'except';
FINALLY   : 'finally';
RAISE     : 'raise';
LAMBDA    : 'lambda';
TRUE      : 'True';
FALSE     : 'False';
NONE      : 'None';
YIELD     : 'yield';
ASSERT    : 'assert';
DEL       : 'del';
GLOBAL    : 'global';
NONLOCAL  : 'nonlocal';

// ==========================================
// OPERATORS
// ==========================================
DOUBLESTAR_EQUAL: '**=';
DOUBLESLASH: '//';
DOUBLESTAR: '**';
LEFTSHIFT : '<<';
RIGHTSHIFT: '>>';
PLUSEQUAL : '+=';
MINUSEQUAL: '-=';
STAREQUAL : '*=';
SLASHEQUAL: '/=';
PERCENTEQUAL: '%=';
ATEQUAL   : '@=';
EQEQUAL   : '==';
NOTEQUAL  : '!=';
LESSEQUAL : '<=';
GREATEREQUAL: '>=';
ARROW     : '->';
PLUS      : '+';
MINUS     : '-';
STAR      : '*';
SLASH     : '/';
PERCENT   : '%';
AT        : '@';
EQUAL     : '=';
AMPER     : '&';
VBAR      : '|';
CIRCUMFLEX: '^';
TILDE     : '~';
LESS      : '<';
GREATER   : '>';

// ==========================================
// DELIMITERS
// ==========================================
LPAREN    : '(' { bracketLevel++; };
RPAREN    : ')' { bracketLevel--; };
LSQB      : '[' { bracketLevel++; };
RSQB      : ']' { bracketLevel--; };
LBRACE    : '{' { bracketLevel++; };
RBRACE    : '}' { bracketLevel--; };
COMMA     : ',';
COLON     : ':';
DOT       : '.';
SEMI      : ';';
ELLIPSIS  : '...';

// ==========================================
// STRINGS
// ==========================================
STRING
    : [rRbBfFuU]* ( SHORT_STRING | LONG_STRING )
    ;

fragment SHORT_STRING
    : '\'' ( STRING_ESCAPE_SEQ | ~[\\\r\n\f'] )* '\''
    | '"' ( STRING_ESCAPE_SEQ | ~[\\\r\n\f"] )* '"'
    ;

fragment LONG_STRING
    : '\'\'\'' .*? '\'\'\''
    | '"""' .*? '"""'
    ;

fragment STRING_ESCAPE_SEQ
    : '\\' .
    ;

// ==========================================
// NUMBERS
// ==========================================
NUMBER
    : INTEGER
    | FLOAT_NUMBER
    | IMAG_NUMBER
    ;

fragment INTEGER
    : DECIMAL_INTEGER
    | OCT_INTEGER
    | HEX_INTEGER
    | BIN_INTEGER
    ;

fragment DECIMAL_INTEGER
    : NON_ZERO_DIGIT DIGIT*
    | '0'+
    ;

fragment OCT_INTEGER
    : '0' [oO] OCT_DIGIT+
    ;

fragment HEX_INTEGER
    : '0' [xX] HEX_DIGIT+
    ;

fragment BIN_INTEGER
    : '0' [bB] BIN_DIGIT+
    ;

fragment NON_ZERO_DIGIT
    : [1-9]
    ;

fragment DIGIT
    : [0-9]
    ;

fragment OCT_DIGIT
    : [0-7]
    ;

fragment HEX_DIGIT
    : [0-9a-fA-F]
    ;

fragment BIN_DIGIT
    : [01]
    ;

fragment FLOAT_NUMBER
    : POINT_FLOAT
    | EXPONENT_FLOAT
    ;

fragment POINT_FLOAT
    : DIGIT* '.' DIGIT+
    | DIGIT+ '.'
    ;

fragment EXPONENT_FLOAT
    : ( DIGIT+ | POINT_FLOAT ) EXPONENT
    ;

fragment EXPONENT
    : [eE] [+-]? DIGIT+
    ;

fragment IMAG_NUMBER
    : ( DIGIT+ | FLOAT_NUMBER ) [jJ]
    ;

// ==========================================
// IDENTIFIERS
// ==========================================
NAME
    : ID_START ID_CONTINUE*
    ;

fragment ID_START
    : '_'
    | [a-zA-Z]
    ;

fragment ID_CONTINUE
    : ID_START
    | [0-9]
    ;

// ==========================================
// NEWLINES AND WHITESPACE
// ==========================================
NEWLINE
    : ( '\r'? '\n' | '\r' | '\f' )
    {
        if (bracketLevel > 0) {
            skip();
        }
    }
    ;

// Skip all whitespace (spaces and tabs)
SKIP_
    : [ \t]+ -> skip
    ;

// ==========================================
// COMMENTS
// ==========================================
COMMENT
    : '#' ~[\r\n\f]* -> skip
    ;

// ==========================================
// LINE CONTINUATION
// ==========================================
LINE_CONTINUATION
    : '\\' [ \t]* ( '\r'? '\n' | '\r' | '\f' ) -> skip
    ;