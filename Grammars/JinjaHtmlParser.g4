parser grammar JinjaHtmlParser;
options { tokenVocab= JinjaHtmlLexer; }


prog: document* EOF;

document: DOCTYPE html_Body
| jinjaDoc;

html_Body:
startElement html_Body* endElement     #HtmlElement
| singleElement                      #SingleHtml
| jinjaExpr                         #JinjaExpression
| jinjaStmt                         #JinjaStatement
| jinjaComnt                     #JinjaComment
| ID                                #Identifier
| STRING                            #String
;
jinjaDoc: jinjaStmt* jinjastart html_Body* jinjaend;
jinjastart: JINJA_STMT_START JINJAS JINJA_STMT_END;
jinjaend:JINJA_STMT_START JINJAE JINJA_STMT_END;
jinjaExpr
    : JINJA_EXPR_START html_Body*? JINJA_EXPR_END
    ;

jinjaStmt
    : JINJA_STMT_START html_Body*? JINJA_STMT_END
    ;

jinjaComnt
    : JINJA_COMMENT_START html_Body*? JINJA_COMMENT_END
    ;


startElement: OST element attripute*? CT;
endElement: OET element CT;
singleElement: OST oneElement attripute*? CT;


oneElement:
LINK                                          #Link
| IMG                                           #Image
| INPUT                                         #Input
;
element
: HTML                                          #Html
| BODY                                          #Body
| HEAD                                          #Head
| H1                                            #H1
| H2                                            #H2
| H3                                            #H3
| H4                                            #H4
| H5                                            #H5
| NAV                                           #Nav
| DIV                                           #Div
| SPAN                                          #Span
| A                                             #A
| TITLE                                         #Title
| P                                             #P
| FORM                                          #Form
| LABEL                                         #Label
;


attripute: ID EQUALS STRING;