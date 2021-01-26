grammar MathExpression;

/* */
// Use this only when u generate
@header {
	package calc.generated;
}


input : expression ;

expression : assignmentList
	| arithmeticList
	| NEWLINE
	;

// Assignments

assignmentList : assignment ((NEWLINE|COMMA) assignment)* ;

assignment : (VAL|VAR) IDENTIFIER (assignmentOperator assignment)? ;

assignmentOperator : ASSIGN
	| ASSIGN_ADD
	| ASSIGN_SUB
	| ASSIGN_MUL
	| ASSIGN_DIV
	| ASSIGN_AND
	| ASSIGN_OR
	| ASSIGN_XOR
	| ASSIGN_MOD
	| ASSIGN_LSHIFT
	| ASSIGN_RSHIFT
	| ASSIGN_URSHIFT
	;

// Arithmetics

arithmeticList : arithmetic (COMMA arithmetic)* ;

arithmetic : constant																			# AnyConstant
	| structure																					# DataStructure
	| arithmetic LPAREN arithmeticList? RPAREN													# Function
	| arithmetic LBRACKET arithmetic RBRACKET 													# ArrayIndexing
	| arithmetic COLON arithmetic COLON arithmetic												# Range
	| (NOT|TILDE|ADD|SUB|INC|DEC) arithmetic 													# Prefix
	| arithmetic (INC|DEC)																		# Postfix
	|<assoc=right> arithmetic POW arithmetic													# Power
	| arithmetic (MUL|DIV|DIV_INT) arithmetic													# MultDiv
	| arithmetic (ADD|SUB) arithmetic															# AddSub
	| arithmetic (OR|XOR|AND) arithmetic														# BitOp
	|<assoc=right> arithmetic MOD arithmetic													# Modulus
	| arithmetic (AND_AND|OR_OR) arithmetic														# LogicalAndOr
	| arithmetic (LT|LE|GT|GE) arithmetic 														# RelativeComparison
	| arithmetic (EQUAL|NOT_EQUAL) arithmetic													# EqualityComparison
	|<assoc=right> arithmetic (LSHIFT|RSHIFT|URSHIFT) arithmetic								# Shift
	| LPAREN arithmetic RPAREN 																	# NestedArithmetic
	|<assoc=right> arithmetic QUESTION arithmetic COLON arithmetic 								# Ternary
	| I arithmetic 																				# PureImaginary
	| arithmetic I 																				# PureImaginary
	| IDENTIFIER																				# Variable
	;

structure : LBRACKET arithmeticList? RBRACKET 's'												# Set
	| LBRACKET arithmeticList? RBRACKET															# Vector
	| LBRACKET UINT RBRACKET LBRACKET UINT RBRACKET LCURLY arithmeticList? RCURLY ('r'|'c')? 	# Matrix		// [3][3]{1,2,3,4,5,6,7,8,9}c == 3x3 col major matrix
	;

constant : TRUE																					# True
	| FALSE 																					# False
	| PI 																						# Pi
	| EXP 																						# Exp
	| UFLOAT																					# Float
	| FLOAT																						# Float
	| UINT 																						# Int
	| INT																						# Int
	| STRING																					# String
	| CHAR																						# Char
	| CIS LPAREN arithmetic COMMA arithmetic RPAREN 											# CisComplex
	;

I : 'i' ;
CIS : 'cis' ;		
PI : [Pp][Ii] ;
EXP : [Ee] ;
TRUE : [Tt][Rr][Uu][Ee] ;
FALSE : [Ff][Aa][Ll][Ss][Ee] ;
STRING : QUOTES (ESC|.)*? QUOTES ;
CHAR : QUOTE ALPHANUMERAL+ QUOTE 
	| DIGITS 'c'
	;
UFLOAT : UINT (DOT UINT? | 'f') ;
FLOAT : SUB UFLOAT ;
UINT : DIGITS 
	| '0' [Xx] HEX_DIGIT+
	;
INT : SUB UINT ;

SEMI : ';' ;
VAR : 'var' ;
VAL : 'val' ;
LPAREN : '(' ;
RPAREN : ')' ;
LBRACKET : '[' ;
RBRACKET : ']' ;
LCURLY : '{' ;
RCURLY : '}' ;
COMMA : ',' ;
DOT : '.' ;
QUOTES : '"' ;
QUOTE : '\'' ;
ASSIGN : '=' ;
GT : '>' ;
LT : '<' ;
NOT : '!' ;
TILDE : '~' ;
QUESTION : '?' ;
COLON : ':' ;
LE : '<=' ;
GE : '>=' ;
EQUAL : '==' ;
NOT_EQUAL : '!=' ;
AND_AND : '&&' ;
OR_OR : '||' ;
INC : '++' ;
DEC : '--' ;
ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV_INT : '//' ;
DIV : '/' ;
POW : '**' ;
AND : '&' ;
OR : '|' ;
XOR : '^' ;
MOD : '%' ;
LSHIFT : '<<' ;
RSHIFT : '>>' ;
URSHIFT : '>>>' ;
ASSIGN_ADD : '+=' ;
ASSIGN_SUB : '-=' ;
ASSIGN_MUL : '*=' ;
ASSIGN_DIV : '/=' ;
ASSIGN_AND : '&=' ;
ASSIGN_OR : '|=' ;
ASSIGN_XOR : '^=' ;
ASSIGN_MOD : '%=' ;
ASSIGN_LSHIFT : '<<=' ;
ASSIGN_RSHIFT : '>>=' ;
ASSIGN_URSHIFT : '>>>=' ;

fragment ALPHANUMERAL : [a-zA-Z0-9] ;
fragment DIGITS : DIGIT+ ;
fragment DIGIT : [0-9] ;
fragment HEX_DIGIT : [0-9A-Fa-f] ;
fragment ESC : '\\' [btnr"\\] ; 			// \b, \t, \n etc...

NEWLINE : '\r'? '\n' ;
WS : [ \t]+ -> skip ;

IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]* ;	// has to be last