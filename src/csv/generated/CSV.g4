grammar CSV;

// Parser rules

file : hdr row+ ;		// start rule

hdr : row ;

row : field (',' field)* '\r'? '\n' ;

field : TEXT 	# text
	| STRING 	# string
	| 			# empty
	;

// Lexer rules

TEXT : ~[,\n\r"]+ ;
STRING : '"' ('""'|~'"')* '"' ;