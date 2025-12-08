parser grammar JinjaHtmlParser;
options { tokenVocab= JinjaHtmlLexer; }


prog: document* EOF;

document: DOCTYPE html;

html: startElement html* endElement
| ID
;

startElement: OST element attripute*? CT;
endElement: OET element CT;

element: HTML
| BODY
| HEAD
| H1
| H2
| H3
| H4
| H5
| NAV
| DIV
| SPAN
| A
| TITLE
| LINK
| P
| IMG
| FORM
| LABEL
| INPUT;


attripute: ID EQUALS STRING;