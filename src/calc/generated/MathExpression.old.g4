grammar MathExpression;

input : expression ;

expression : assignmentList
	| arithmeticList
	| NEWLINE
	;

// Assignments

assignmentList : assignment (NEWLINE assignment)* ;

assignment : (VAR|VAL|) IDENTIFIER (ASSIGNMENT_OPERATOR expression)? ;

// Arithmetics

arithmeticList : arithmetic (COMMA arithmetic)* ;

arithmetic : atom 													# AnyAtom
	| arithmetic LPAREN arithmeticList? RPAREN 						# Function
	| arithmetic LBRACKET arithmetic RBRACKET 						# ArrayIndexing
	| arithmetic COLON arithmetic (COLON arithmetic)?				# Range
	|<assoc=right> arithmetic POW arithmetic						# Power
	| (TILDE|ADD|SUB|INC|DEC) arithmetic 							# Prefix
	| arithmetic (INC|DEC)											# Postfix
	| arithmetic (MUL|DIV|DIV_INT) arithmetic						# MultDiv
	| arithmetic (ADD|SUB) arithmetic								# AddSub
	| arithmetic (OR|XOR|AND) arithmetic							# BitOp
	|<assoc=right> arithmetic MOD arithmetic						# Modulus		
	| arithmetic (AND_AND|OR_OR) arithmetic							# LogicalAndOr
	| arithmetic (LT|LE|GT|GE) arithmetic 							# RelativeComparison
	| arithmetic (EQUAL|NOT_EQUAL) arithmetic						# EqualityComparison
	|<assoc=right> arithmetic QUESTION arithmetic COLON arithmetic 	# Ternary 
	|<assoc=right> arithmetic (LSHIFT|RSHIFT|URSHIFT) arithmetic	# Shift
	| NOT arithmetic												# LogicalNot
	| LPAREN arithmetic RPAREN 										# NestedArithmetic
	;

atom : primitive	# AnyPrimitive
	| STRING		# String 
	| CHAR			# Char
	| setAtom		# Set
	| vectorAtom	# Vector
	| matrixAtom	# Matrix
	| TRUE			# True
	| FALSE 		# False
	| IDENTIFIER	# Variable
	;

setAtom : vectorAtom 's' ;

vectorAtom : LBRACKET (atom (COMMA atom)*)? RBRACKET ;

matrixAtom : LBRACKET DIGITS RBRACKET LBRACKET DIGITS RBRACKET LCURLY (primitive (COMMA primitive)*)? RCURLY ('r'|'c')? ;	// [3][3]{1,2,3,4,5,6,7,8,9}c == 3x3 col major matrix

// For matrix only
primitive : COMPLEX 		# Complex
	| POLAR_COMPLEX 		# PolarComplex
	| CIS_COMPLEX			# CisComplex
	| PI 					# Pi
	| EXP 					# Exp
	| UFLOAT				# Float
	| FLOAT					# Float
	| UINT 					# Int
	| INT					# Int
	;

ASSIGNMENT_OPERATOR : ASSIGN
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

IM : 'i' ;
CHAR : QUOTE ALPHANUMERAL+ QUOTE 
	| DIGITS 'c'
	;
UFLOAT : UINT (DOT UINT? | 'f') ;
FLOAT : SUB UFLOAT ;
UINT : DIGITS 
	| '0' [Xx] HEX_DIGIT+
	;
INT : SUB UINT ;
PI : [Pp][Ii] ;
EXP : [Ee] ;
TRUE : [Tt][Rr][Uu][Ee] ;
FALSE : [Ff][Aa][Ll][Ss][Ee] ;
STRING : QUOTES (ESC|.)*? QUOTES ;	// non-greedy capture
DIGITS : DIGIT+ ;
DIGIT : [0-9] ;
COMPLEX : SUB? IMAGINARY
	| NUMBER (ADD|SUB) IMAGINARY
	;
POLAR_COMPLEX : NUMBER? EXP POW IMAGINARY ;
CIS_COMPLEX : NUMBER? CIS UNSIGNED ;
IDENTIFIER : [a-zA-Z_]+[a-zA-Z0-9_]* ;	// has to be after complex so i doesn't match this first

VAR : 'var' ;
VAL : 'val' ;
CIS : 'cis' ;
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

fragment IMAGINARY : IM UNSIGNED? 
	| UNSIGNED IM
	;
fragment ALPHANUMERAL : [a-zA-Z] 
	| DIGIT 
	;
fragment NUMBER : UFLOAT
	| FLOAT
	| UINT
	| INT
	;
fragment UNSIGNED : UFLOAT 
	| UINT 
	;
fragment HEX_DIGIT : [0-9A-Fa-f] ;
fragment ESC : '\\' [btnr"\\] ; 			// \b, \t, \n etc...

NEWLINE : '\r'? '\n' ;
WS : [ \t]+ -> skip ;

/*

+-	Boolean	Int	Float	String	
Boolean				
Int		k	k	
Float		k	k	
String				

/*	Boolean	Int	Float	String	
Boolean				
Int		k	k	
Float		k	k	
String				

++--	Boolean	Int	Float	String	
Boolean				
Int				k	k	
Float			k	k	
String				

|^&		Boolean	Int	Float	String		for B vs B: non-short-circuiting operators
Boolean	k			
Int				k	k	
Float			k	k	
String				

%		Boolean	Int	Float	String	
Boolean				
Int				k	k	
Float			k	k	
String				

&&||	Boolean	Int	Float	String		number == 0 || string == "" <=> false
Boolean	k		k	k		k		
Int		k		k	k		k
Float	k		k	k		k
String	k		k	k		k

<<=>>=	Boolean Int Float 	String		we suppose boolean == 0 || 1
Boolean	k		I>B	F>B	
Int		I>B		k	k		length
Float	F>B		k	k		length
String	length	length		k

!		Boolean	Int	Float	String		flip string chars based on ascii table
Boolean	k		k	k		k				flip int+float bits
Int		k		k	k		k		
Float	k		k	k		k
String	k		k	k		k

*/