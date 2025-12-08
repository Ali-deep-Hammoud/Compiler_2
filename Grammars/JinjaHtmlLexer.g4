lexer grammar JinjaHtmlLexer;


DOCTYPE: '<!DOCTYPE ' .*? '>';

OST: '<';
CT: '>';
OET: '</';
EM: '!';
EQUALS: '=';
COLON : ':';
HTML: 'html';
BODY: 'body';
HEAD: 'head';
H1: 'h1';
H2: 'h2';
H3: 'h3';
H4: 'h4';
H5: 'h5';
NAV: 'nav';
DIV: 'div';
SPAN: 'span';
A: 'a';
TITLE: 'title';
LINK: 'link';
P: 'p';
IMG: 'img';
FORM: 'form';
LABEL: 'label';
INPUT: 'input';


STRING: '"' ( ~["\\] | '\\' . )* '"';
ID: [a-zA-Z0-9]+;


WS : [ \t\r\n]+ -> skip ;