grammar Commands;

/* Comment when you want to use ANTLR debugging tools */
@header {
package commands.generated;
}

input : statement ;

statement : <assoc=right> statement (REDIR_IN|REDIR_OUT|REDIR_APPEND) statement 	# Redirection
	| statement (AND|OR|PIPE) statement  											# Chain
	| command 																		# GenericCommand
	;

command : NAME argument* ;

argument : namedArg 
	| unnamedArg 
	| STRING
	| NAME
	;

namedArg : DBL_DASH NAME (EQUAL (STRING|NAME))? ;

unnamedArg : DASH NAME ;

AND : '&&' ;
OR : '||' ;
PIPE : '|' ;
REDIR_IN : '<' ;
REDIR_OUT : '>' ;
REDIR_APPEND : '>>' ;
SEMI : ';' ;
DASH : '-' ;
DBL_DASH : '--' ;
EQUAL : '=' ;
QUOTES : '"' ;

NEWLINE : '\r'? '\n' ;
WS : [ \t] -> skip ;

STRING : QUOTES (ESC|.)*? QUOTES ;
NAME : [a-zA-Z0-9.]([a-zA-Z0-9.]|SPECIAL)+ ;

fragment SPECIAL : [\\?[\]\-*@#] ;	 			// other expansions+discord special chars
fragment ESC : '\\' [btnr"\\?[\]\-*] ; 			// btnr"\ == default