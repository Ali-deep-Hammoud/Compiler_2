parser grammar PythonParser;
options { tokenVocab = PythonLexer; }


file_input
    : ( NEWLINE | stmt )* EOF
    ;

stmt
    : simple_stmt #StmtSimple
    | compound_stmt #StmtCompound
    ;

simple_stmt
    : small_stmt ( SEMI small_stmt )* SEMI? NEWLINE?
    ;

small_stmt
    : expr_stmt #SmallStmtExpr
    | del_stmt #SmallStmtDel
    | pass_stmt #SmallStmtPass
    | flow_stmt #SmallStmtFlow
    | import_stmt #SmallStmtImport
    | global_stmt #SmallStmtGlobal
    | nonlocal_stmt #SmallStmtNonlocal
    | assert_stmt #SmallStmtAssert
    ;

expr_stmt
    : testlist_star_expr (augassign testlist | (EQUAL testlist_star_expr)* )?
    ;

augassign
    : PLUSEQUAL #AugAssignPlus
    | MINUSEQUAL #AugAssignMinus
    | STAREQUAL #AugAssignStar
    | SLASHEQUAL #AugAssignSlash
    | PERCENTEQUAL #AugAssignPercent
    | ATEQUAL #AugAssignAt
    | DOUBLESTAR_EQUAL #AugAssignDoubleStar
    ;

del_stmt
    : DEL exprlist
    ;

pass_stmt
    : PASS
    ;

flow_stmt
    : break_stmt #FlowStmtBreak
    | continue_stmt #FlowStmtContinue
    | return_stmt #FlowStmtReturn
    | raise_stmt #FlowStmtRaise
    | yield_stmt #FlowStmtYield
    ;

break_stmt
    : BREAK
    ;

continue_stmt
    : CONTINUE
    ;

return_stmt
    : RETURN testlist?
    ;

yield_stmt
    : yield_expr
    ;

raise_stmt
    : RAISE (test (FROM test)?)?
    ;

import_stmt
    : import_name            #ImportStmtName
    | import_from            #ImportStmtFrom
    ;

import_name
    : IMPORT dotted_as_names
    ;

import_from
    : FROM (DOT* dotted_name | DOT+) IMPORT (STAR | LPAREN import_as_names RPAREN | import_as_names)
    ;

import_as_name
    : NAME (AS NAME)?
    ;

dotted_as_name
    : dotted_name (AS NAME)?
    ;

import_as_names
    : import_as_name (COMMA import_as_name)* COMMA?
    ;

dotted_as_names
    : dotted_as_name (COMMA dotted_as_name)*
    ;

dotted_name
    : NAME (DOT NAME)*
    ;

global_stmt
    : GLOBAL NAME (COMMA NAME)*
    ;

nonlocal_stmt
    : NONLOCAL NAME (COMMA NAME)*
    ;

assert_stmt
    : ASSERT test (COMMA test)?
    ;

// ==========================================
// COMPOUND STATEMENTS
// ==========================================
compound_stmt
    : if_stmt               #CompoundStmtIf
    | while_stmt            #CompoundStmtWhile
    | for_stmt              #CompoundStmtFor
    | try_stmt              #CompoundStmtTry
    | with_stmt             #CompoundStmtWith
    | funcdef               #CompoundStmtFunc
    | classdef              #CompoundStmtClass
    | decorated             #CompoundStmtDecorated
    ;

if_stmt
    : IF test COLON suite (ELIF test COLON suite)* (ELSE COLON suite)?
    ;

while_stmt
    : WHILE test COLON suite (ELSE COLON suite)?
    ;

for_stmt
    : FOR exprlist IN testlist COLON suite (ELSE COLON suite)?
    ;

try_stmt
    : TRY COLON suite
      ((except_clause COLON suite)+
       (ELSE COLON suite)?
       (FINALLY COLON suite)?
      | FINALLY COLON suite)
    ;

with_stmt
    : WITH with_item (COMMA with_item)* COLON suite
    ;

with_item
    : test (AS expr)?
    ;

except_clause
    : EXCEPT (test (AS NAME)?)?
    ;

suite
    : simple_stmt #SuiteSimple
    | NEWLINE* stmt+ #SuiteCompound
    ;

// ==========================================
// FUNCTION AND CLASS DEFINITIONS
// ==========================================
funcdef
    : DEF NAME parameters (ARROW test)? COLON suite
    ;

parameters
    : LPAREN typedargslist? RPAREN #Parameters_
    ;

typedargslist
    : (tfpdef (EQUAL test)? (COMMA tfpdef (EQUAL test)?)* COMMA?
      | STAR tfpdef? (COMMA tfpdef (EQUAL test)?)* (COMMA DOUBLESTAR tfpdef)?
      | DOUBLESTAR tfpdef)
    ;

tfpdef
    : NAME (COLON test)?
    ;

classdef
    : CLASS NAME (LPAREN arglist? RPAREN)? COLON suite
    ;

decorated
    : decorator+ (classdef | funcdef)
    ;

decorator
    : AT dotted_name (LPAREN arglist? RPAREN)? NEWLINE
    ;

// ==========================================
// EXPRESSIONS
// ==========================================
test
    : or_test (IF or_test ELSE test)? #TestCond
    | lambdef #TestLambda
    ;

test_nocond
    : or_test #TestNoCondOr
    | lambdef_nocond #TestNoCondLambda
    ;

lambdef
    : LAMBDA varargslist? COLON test
    ;

lambdef_nocond
    : LAMBDA varargslist? COLON test_nocond
    ;

or_test
    : and_test (OR and_test)*
    ;

and_test
    : not_test (AND not_test)*
    ;

not_test
    : NOT not_test #NotTestNot
    | comparison #NotTestComp
    ;

comparison
    : expr (comp_op expr)*
    ;

comp_op
    : LESS #CompOpLess
    | GREATER #CompOpGreater
    | EQEQUAL #CompOpEq
    | GREATEREQUAL #CompOpGe
    | LESSEQUAL #CompOpLe
    | NOTEQUAL #CompOpNe
    | IN #CompOpIn
    | NOT IN #CompOpNotIn
    | IS #CompOpIs
    | IS NOT #CompOpIsNot
    ;

star_expr
    : STAR expr
    ;

expr
    : xor_expr (VBAR xor_expr)*
    ;

xor_expr
    : and_expr (CIRCUMFLEX and_expr)*
    ;

and_expr
    : shift_expr (AMPER shift_expr)*
    ;

shift_expr
    : arith_expr ((LEFTSHIFT | RIGHTSHIFT) arith_expr)*
    ;

arith_expr
    : term ((PLUS | MINUS) term)*
    ;

term
    : factor ((STAR | AT | SLASH | PERCENT | DOUBLESLASH) factor)*
    ;

factor
    : (PLUS | MINUS | TILDE) factor #FactorUnary
    | power #FactorPower
    ;

power
    : atom_expr (DOUBLESTAR factor)?
    ;

atom_expr
    : atom trailer*
    ;

atom
    : LPAREN (yield_expr | testlist_comp)? RPAREN #AtomParen
    | LSQB testlist_comp? RSQB #AtomList
    | LBRACE dictorsetmaker? RBRACE #AtomDict
    | NAME #AtomName
    | NUMBER #AtomNumber
    | STRING+ #AtomString
    | ELLIPSIS #AtomEllipsis
    | NONE #AtomNone
    | TRUE #AtomTrue
    | FALSE #AtomFalse
    ;

testlist_comp
    : (test | star_expr) (comp_for | (COMMA (test | star_expr))* COMMA?)
    ;

trailer
    : LPAREN arglist? RPAREN #TrailerCall
    | LSQB subscriptlist RSQB #TrailerIndex
    | DOT NAME #TrailerDot
    ;

subscriptlist
    : subscript (COMMA subscript)* COMMA?
    ;

subscript
    : test #SubscriptTest
    | test? COLON test? sliceop? #SubscriptSlice
    ;

sliceop
    : COLON test?
    ;

exprlist
    : (expr | star_expr) (COMMA (expr | star_expr))* COMMA?
    ;

testlist
    : test (COMMA test)* COMMA?
    ;

dictorsetmaker
    : NEWLINE* ((test COLON test | DOUBLESTAR expr) NEWLINE*
       (comp_for | (COMMA NEWLINE* (test COLON test | DOUBLESTAR expr) NEWLINE*)* COMMA? NEWLINE*)
      | (test | star_expr) NEWLINE*
       (comp_for | (COMMA NEWLINE* (test | star_expr) NEWLINE*)* COMMA? NEWLINE*))
    ;

classdef_or_funcdef
    : classdef #ClassDefOrFuncDefClass
    | funcdef #ClassDefOrFuncDefFunc
    ;

arglist
    : argument (COMMA argument)* COMMA?
    ;

argument
    : test comp_for?                   #ArgumentComp
      | test EQUAL test                 #ArgumentEqual
      | DOUBLESTAR test                 #ArgumentDoubleStar
      | STAR test                       #ArgumentStar
    ;

comp_iter
    : comp_for #CompIterFor
    | comp_if #CompIterIf
    ;

comp_for
    : FOR exprlist IN or_test comp_iter?
    ;

comp_if
    : IF test_nocond comp_iter?
    ;

yield_expr
    : YIELD yield_arg?
    ;

yield_arg
    : FROM test #YieldArgFrom
    | testlist #YieldArgList
    ;

// ==========================================
// HELPER RULES
// ==========================================
testlist_star_expr
    : (test | star_expr) (COMMA (test | star_expr))* COMMA?
    ;

varargslist
    : (vfpdef (EQUAL test)? (COMMA vfpdef (EQUAL test)?)* COMMA?
      | STAR vfpdef? (COMMA vfpdef (EQUAL test)?)* (COMMA DOUBLESTAR vfpdef)?
      | DOUBLESTAR vfpdef)
    ;

vfpdef
    : NAME
    ;
