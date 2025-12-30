parser grammar PythonParser;
options { tokenVocab = PythonLexer; }


file_input
    : ( NEWLINE | stmt )* EOF
    ;

stmt
    : simple_stmt
    | compound_stmt
    ;

simple_stmt
    : small_stmt ( SEMI small_stmt )* SEMI? NEWLINE?
    ;

small_stmt
    : expr_stmt
    | del_stmt
    | pass_stmt
    | flow_stmt
    | import_stmt
    | global_stmt
    | nonlocal_stmt
    | assert_stmt
    ;

expr_stmt
    : testlist_star_expr (augassign testlist
                         | (EQUAL testlist_star_expr)* )?
    ;

augassign
    : PLUSEQUAL | MINUSEQUAL | STAREQUAL | SLASHEQUAL
    | PERCENTEQUAL | ATEQUAL | DOUBLESTAR_EQUAL
    ;

del_stmt
    : DEL exprlist
    ;

pass_stmt
    : PASS
    ;

flow_stmt
    : break_stmt
    | continue_stmt
    | return_stmt
    | raise_stmt
    | yield_stmt
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
    : import_name
    | import_from
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
    : if_stmt
    | while_stmt
    | for_stmt
    | try_stmt
    | with_stmt
    | funcdef
    | classdef
    | decorated
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
    : simple_stmt
    | NEWLINE* stmt+
    ;

// ==========================================
// FUNCTION AND CLASS DEFINITIONS
// ==========================================
funcdef
    : DEF NAME parameters (ARROW test)? COLON suite
    ;

parameters
    : LPAREN typedargslist? RPAREN
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
    : or_test (IF or_test ELSE test)?
    | lambdef
    ;

test_nocond
    : or_test
    | lambdef_nocond
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
    : NOT not_test
    | comparison
    ;

comparison
    : expr (comp_op expr)*
    ;

comp_op
    : LESS | GREATER | EQEQUAL | GREATEREQUAL | LESSEQUAL
    | NOTEQUAL | IN | NOT IN | IS | IS NOT
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
    : (PLUS | MINUS | TILDE) factor
    | power
    ;

power
    : atom_expr (DOUBLESTAR factor)?
    ;

atom_expr
    : atom trailer*
    ;

atom
    : LPAREN (yield_expr | testlist_comp)? RPAREN
    | LSQB testlist_comp? RSQB
    | LBRACE dictorsetmaker? RBRACE
    | NAME
    | NUMBER
    | STRING+
    | ELLIPSIS
    | NONE
    | TRUE
    | FALSE
    ;

testlist_comp
    : (test | star_expr) (comp_for | (COMMA (test | star_expr))* COMMA?)
    ;

trailer
    : LPAREN arglist? RPAREN
    | LSQB subscriptlist RSQB
    | DOT NAME
    ;

subscriptlist
    : subscript (COMMA subscript)* COMMA?
    ;

subscript
    : test
    | test? COLON test? sliceop?
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
    : classdef
    | funcdef
    ;

arglist
    : argument (COMMA argument)* COMMA?
    ;

argument
    : (test comp_for?
      | test EQUAL test
      | DOUBLESTAR test
      | STAR test)
    ;

comp_iter
    : comp_for
    | comp_if
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
    : FROM test
    | testlist
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