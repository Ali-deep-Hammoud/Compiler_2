lexer grammar JinjaHtmlLexer;



DOCTYPE
    : '<!DOCTYPE' (~'>')* '>'
    ;

JINJA_EXPR_START : '{{' -> pushMode(JINJA_EXPR);
JINJA_STMT_START : '{%' -> pushMode(JINJA_STMT);
JINJA_COMMENT_START : '{#' -> pushMode(JINJA_COMMENT);



OST: '<' -> pushMode(TAG);

OET: '</' -> pushMode(TAG);


TEXT
    :   (   ~[<{}\n\r] |
           '{' ~[{%#] |
            ~[%#}] '}'
        )+
    ;

HTML_COMMENT : '<!--' .*? '-->' -> skip;

WS : [ \t\r\n]+ -> skip ;

//JINJA EXPRESSION
mode JINJA_EXPR;

JINJA_EXPR_END : '}}' -> popMode;


JINJA_COMMA : ',';




JINJA_TEXT
    : (~'}')+ ;
JINJA_EXPR_WS : [ \t\r\n]+ -> skip ;


//JINJA STATEMENT
mode JINJA_STMT;
JINJA_STMT_END : '%}' -> popMode;

JINJA_LP : '(';
JINJA_RP : ')';

JINJA_BLOCK : 'block';
JINJA_ENDBLOCK : 'endblock';
JINJA_SUPER : 'super';
JINJA_EXTENDS : 'extends';
JINJA_INCLUDE : 'include';
JINJA_FOR : 'for';
JINJA_ENDFOR : 'endfor';
JINJA_IF : 'if';
JINJA_ELIF : 'elif';
JINJA_ELSE : 'else';
JINJA_ENDIF : 'endif';
JINJA_SET : 'set';
JINJA_IMPORT : 'import';
JINJA_FROM : 'from';
JINJA_INS:  'in' | 'not in';
JINJA_COMPARE : '==' | '!=' | '<' | '>' | '<=' | '>=' | 'is' ;
JINJA_LOGIC: 'and'|'or';
JINJA_NOT:'not';


JINJA_NUM: '0'| [1-9][0-9]*;
JINJA_ID : [a-zA-Z_][a-zA-Z0-9_]*( '.' [a-zA-Z_][a-zA-Z0-9_]* )* ;
JINJA_STRING : '"' ~["]* '"' ;


JINJA_STMT_WS : [ \t]+ -> skip ;
JINJA_STMT_NL : [\r\n]+ -> skip ;

// JINJA COMMENT
mode JINJA_COMMENT;
JINJA_COMMENT_END : '#}' -> popMode;
JINJA_COMMENT_TEXT : .+? -> skip;
JINJA_COMMENT_WS : [ \t\r\n]+ -> skip ;
//TAG
mode TAG;

CT: '>' -> popMode ;
JINJA_EXPR_START_TAG : '{{' -> pushMode(JINJA_EXPR);
STYLE_TAG
    : 'style>' -> pushMode(CSS)
    ;
JINJA_DQ:'"';

EM: '!';
EQUALS: '=';
COLON : ':';
LKB: '{';
RKB: '}';

PAIRED_TAG: 'html' | 'body' | 'head' | 'title'
          | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6'
          | 'nav' | 'div' | 'span' | 'a' | 'p'
          | 'form' | 'label' | 'button'|'strong'
          | 'ul' | 'ol' | 'li'| 'textarea'
          | 'section' | 'article' | 'header' | 'footer'
          | 'table' | 'tr' | 'td' | 'th' | 'thead' | 'tbody' | 'tfoot';

VOID_TAG: 'link' | 'img' | 'input' | 'br' | 'hr' | 'meta';
ATTRIBUTE_NAME: 'class' | 'id' | 'name' | 'href' | 'src' | 'alt'| 'enctype' | 'step'
              | 'title' | 'value' | 'method' | 'type' |'accept'|'name'
              | 'placeholder' | 'action' | 'width' | 'height'
              | 'charset' | 'rel' | 'target' | 'disabled' | 'checked'
              | 'required' | 'readonly' | 'maxlength' | 'minlength'
              | 'pattern' | 'autocomplete' | 'autofocus' | 'multiple'
              | 'selected' | 'for' | 'colspan' | 'rowspan'
              | 'data-' [a-zA-Z0-9_-]+;
STRING: '"' ~[ <{"}]* '"';

ID: [a-zA-Z0-9]+;


TAG_WS: [ \t\r\n]+ -> skip ;

mode CSS;

CSS_END_STYLE
    : '</style' -> popMode
    ;

CSS_LBRACE : '{';
CSS_RBRACE : '}';
CSS_COLON  : ':';
CSS_SEMI   : ';';
CSS_COMMA  : ',';
CSS_DOT    : '.';
CSS_HASH   : '#';
CSS_ALL : '*';
CSS_LP:'(';
CSS_RP:')';
CSS_HSL: 'hsl';
CSS_TRANSLATEX: 'translateX';
CSS_TRANSLATEY:'translateY';
CSS_TRANSLATE:'translate';
CSS_ROTATE:'rotate';
CSS_SCALEX:'scaleX';
CSS_SCALEY:'scaleY';
CSS_SCALE:'scale';
CSS_CALC:'calc';

CSS_NUMBER
    : '-'? [0-9]+ ('.' [0-9]+)?
    ;

CSS_MATH : '+'| '-' |'/';

CSS_UNIT
    : 'px' | 'em' | 'rem' | '%' | 'vh' | 'vw' | 'deg'
    ;

CSS_STRING
    : '"' (~["\\] | '\\' .)* '"'
    | '\'' (~['\\] | '\\' .)* '\''
    ;

CSS_NAME
    :[_a-zA-Z] [_a-zA-Z0-9-]*
    ;
CSS_HEX
    : [0-9a-fA-F]+
    ;

CSS_COMMENT
    : '/*' .*? '*/' -> skip
    ;

CSS_WS
    : [ \t\r\n]+ -> skip
    ;
