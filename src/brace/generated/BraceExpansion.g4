grammar BraceExpansion;

/**/
@header
{
package brace.generated;
}


input : expansion ;

expansion : preamble LCURLY (csv|range) RCURLY postscript ;

csv : postscript (COMMA postscript)+ ;

range : (CHAR|INT) RANGE (CHAR|INT) (RANGE INT)? ;

postscript : expansion
	| preamble
	;

preamble : WORD
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
WORD : ~[0-9{}.,]~[{}.,]+ ;