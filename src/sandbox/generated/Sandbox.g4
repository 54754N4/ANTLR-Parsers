grammar Sandbox;

input : number? CIS UNSIGNED 
	| IDENTIFIER
	;

number : FLOAT
	| UFLOAT 
	| UINT
	| INT
	;

fragment DIGIT : [0-9] ;

UFLOAT : UINT (DOT UINT? | 'f') ;
FLOAT : SUB UFLOAT ;
UINT : DIGITS ;
INT : SUB UINT ;
UNSIGNED : UFLOAT 
	| UINT 
	;
DIGITS : DIGIT+ ;

// Specific lexer rules
CIS : 'cis' ;
SUB : '-' ; 
DOT : '.' ;
WS : [ \t]+ -> skip ;
NEWLINE : '\r'? '\n' ;

IDENTIFIER : [a-zA-Z_]+[a-zA-Z0-9_]* ;	// has to be after complex so i or cis doesn't match this first