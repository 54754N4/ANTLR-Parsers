grammar PropertyFile;

file : prop+ ;
prop : ID '=' STRING NEWLINE ;

ID : [a-zA-Z0-9_ ]+ ;
STRING : '"' (ESC|.)*? '"' ;
NEWLINE : '\r'? '\n' ;

fragment ESC : '\\' [btnr"\\] ; 			// \b, \t, \n etc...