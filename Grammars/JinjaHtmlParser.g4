parser grammar JinjaHtmlParser;
options { tokenVocab= JinjaHtmlLexer; }


prog: topLevel* EOF;

topLevel: document         #BaseDocument
        | HTML_COMMENT     #TopLevelComment
        | TEXT             #TopLevelText
        ;

document: DOCTYPE? html_Body         #Html
        | jinjaInheritance                  #Jinja
        ;
html_Body:
startElement html_Body* endElement     #HtmlElement
| singleElement                      #SingleHtml
| jinjaExpr                         #JinjaExpression
| jinjaStmt                         #JinjaStatement
| jinjaComnt                     #JinjaComment
| jinjaConditionStmt                    #JinjaConditionStatement
|jinjaBlock                             #JinjaBlockPlace
|jinjaForLoop                           #JinjaLoop
|HTML_COMMENT                        #HtmlComment
| ID                                #Identifier
| TEXT                            #Text
;


startElement: OST PAIRED_TAG attribute*? CT;
endElement: OET PAIRED_TAG CT;
singleElement: OST VOID_TAG attribute*? CT;
attribute: ATTRIBUTE_NAME (EQUALS (JINJA_DQ jinjaExpr JINJA_DQ|STRING))?;


jinjaInheritance: inheritanceStart jinjaBlock+;

inheritanceStart: JINJA_STMT_START JINJA_EXTENDS JINJA_STRING JINJA_STMT_END;



//JINJA BLOCK STATEMENT
jinjaBlock: jinjaSuperBlock? jinjaBlockStart html_Body* jinjaBlockeEnd;
jinjaBlockStart: JINJA_STMT_START JINJA_BLOCK JINJA_ID JINJA_STMT_END;
jinjaBlockeEnd:JINJA_STMT_START JINJA_ENDBLOCK JINJA_STMT_END;
jinjaSuperBlock: JINJA_EXPR_START JINJA_SUPER JINJA_EXPR_END;

//JINJA IF STATEMENT
jinjaConditionStmt: jinjaIf html_Body? (jinjaElseIf html_Body?)* (jinjaElse html_Body?)? jinjaEndIf;
jinjaIf: JINJA_STMT_START JINJA_IF jinjaConditions JINJA_STMT_END;
jinjaElseIf:JINJA_STMT_START JINJA_ELIF jinjaConditions JINJA_STMT_END;
jinjaElse:JINJA_STMT_START JINJA_ELSE  JINJA_STMT_END;
jinjaEndIf:JINJA_STMT_START JINJA_ENDIF  JINJA_STMT_END;
jinjaConditions
    : jinjaConditions JINJA_LOGIC jinjaConditions                    #JinjaConditionsRoot
    |JINJA_LP jinjaConditions JINJA_RP                               #JinjaParentecesCondition
    | JINJA_NOT? jinjaVariable                                       #JinjaVaraiableConditon
    | JINJA_NOT jinjaConditions                                     #JinjaCondition
    | jinjaVariable (JINJA_COMPARE | JINJA_INS)jinjaVariable                      #JinjaCompareCondition
    ;
//JINJA FOR STATEMENT
jinjaForLoop: jinjaFor html_Body? (jinjaElse html_Body?)? jinjaEndFor;
jinjaFor: JINJA_STMT_START JINJA_FOR JINJA_ID JINJA_INS JINJA_ID (JINJA_IF jinjaConditions)? JINJA_STMT_END;
jinjaEndFor: JINJA_STMT_START JINJA_ENDFOR JINJA_STMT_END;
jinjaVariable: JINJA_NUM | JINJA_ID | JINJA_STRING;



jinjaExpr
    : (JINJA_EXPR_START | JINJA_EXPR_START_TAG) (JINJA_TEXT (JINJA_COMMA JINJA_TEXT)*)* JINJA_EXPR_END
    ;

jinjaStmt
    : JINJA_STMT_START JINJA_TEXT* JINJA_STMT_END
    ;

jinjaComnt
    : JINJA_COMMENT_START JINJA_COMMENT_TEXT* JINJA_COMMENT_END
    ;
