grammar BraceExpansion;

/*
@header
{
	package brace.generated;
}
*/

input : expansion ;

expansion : preamble '{' statement '}' postscript ;

statement : any (COMMA any)* 					 # CSV
	| (CHAR|INT) RANGE (CHAR|INT) (RANGE INT)?   # Range
	;

preamble : WORD
	| INT
	| CHAR
	|
	;
postscript : any ;
any : expansion
	| WORD
	| INT
	| CHAR
	|
	;

LCURLY : '{' ;
RCURLY : '}' ;
RANGE : '..' ;
COMMA : ',' ;

INT : '0'* [0-9]+ ;
CHAR : [a-zA-Z0-9] ;
WORD : ~[{]~[{},.]+ ;
