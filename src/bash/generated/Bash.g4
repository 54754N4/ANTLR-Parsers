/** Converts the official yacc grammar file for Bash v5
 * (from the parse.y file) to a valid ANTLR grammar.
 *
 * References : https://github.com/bminor/bash/blob/master/parse.y
 */
grammar Bash;

/*
@header{
package bash.generated;
}
*/

inputunit:  simple_list (simple_list_terminator simple_list)* EOF ;
 
word_list:  WORD
	| 	NUMBER 				// can also be a word
    |   word_list WORD
    | 	word_list NUMBER
    ;

redirection:    '>' WORD
    |   '<' WORD
    |   NUMBER '>' WORD
    |   NUMBER '<' WORD
    |   REDIR_WORD '>' WORD
    |   REDIR_WORD '<' WORD
    |   GREATER_GREATER WORD
    |   NUMBER GREATER_GREATER WORD
    |   REDIR_WORD GREATER_GREATER WORD
    |   GREATER_BAR WORD
    |   NUMBER GREATER_BAR WORD
    |   REDIR_WORD GREATER_BAR WORD
    |   LESS_GREATER WORD
    |   NUMBER LESS_GREATER WORD
    |   REDIR_WORD LESS_GREATER WORD
    |   LESS_LESS WORD
    |   NUMBER LESS_LESS WORD
    |   REDIR_WORD LESS_LESS WORD
    |   LESS_LESS_MINUS WORD
    |   NUMBER LESS_LESS_MINUS WORD
    |   REDIR_WORD  LESS_LESS_MINUS WORD
    |   LESS_LESS_LESS WORD
    |   NUMBER LESS_LESS_LESS WORD
    |   REDIR_WORD LESS_LESS_LESS WORD
    |   LESS_AND NUMBER
    |   NUMBER LESS_AND NUMBER
    |   REDIR_WORD LESS_AND NUMBER
    |   GREATER_AND NUMBER
    |   NUMBER GREATER_AND NUMBER
    |   REDIR_WORD GREATER_AND NUMBER
    |   LESS_AND WORD
    |   NUMBER LESS_AND WORD
    |   REDIR_WORD LESS_AND WORD
    |   GREATER_AND WORD
    |   NUMBER GREATER_AND WORD
    |   REDIR_WORD GREATER_AND WORD
    |   GREATER_AND '-'
    |   NUMBER GREATER_AND '-'
    |   REDIR_WORD GREATER_AND '-'
    |   LESS_AND '-'
    |   NUMBER LESS_AND '-'
    |   REDIR_WORD LESS_AND '-'
    |   AND_GREATER WORD
    |   AND_GREATER_GREATER WORD
    ;
 
simple_command_element: WORD
    |   ARITH_CMD
    |   COND_CMD
    |   ASSIGNMENT_WORD
    |   NUMBER
    |   redirection
    ;
 
redirection_list: redirection
    |   redirection_list redirection
    ;
 
simple_command: simple_command_element
    |	simple_command simple_command_element
    ;
 
command:   simple_command
	|   shell_command
	|   shell_command redirection_list
    |   function_def
    |   coproc
    ;
 
shell_command:  for_command
    |   case_command
    |   WHILE compound_list DO compound_list DONE
    |   UNTIL compound_list DO compound_list DONE
    |   select_command
    |   if_command
    |   subshell
    |   group_command
    |   arith_command
    |   cond_command
    |   arith_for_command
    ;
 
for_command:    FOR WORD newline_list DO compound_list DONE
    |   FOR WORD newline_list LCURLY compound_list RCURLY
    |   FOR WORD ';' newline_list DO compound_list DONE
    |   FOR WORD ';' newline_list LCURLY compound_list RCURLY
    |   FOR WORD newline_list IN word_list list_terminator newline_list DO compound_list DONE
    |   FOR WORD newline_list IN word_list list_terminator newline_list LCURLY compound_list RCURLY
    |   FOR WORD newline_list IN list_terminator newline_list DO compound_list DONE
    |   FOR WORD newline_list IN list_terminator newline_list LCURLY compound_list RCURLY
    ;
 
arith_for_command:  FOR ARITH_FOR_EXPRS list_terminator newline_list DO compound_list DONE
    |       FOR ARITH_FOR_EXPRS list_terminator newline_list LCURLY compound_list RCURLY
    |       FOR ARITH_FOR_EXPRS DO compound_list DONE
    |       FOR ARITH_FOR_EXPRS LCURLY compound_list RCURLY
    ;
 
select_command: SELECT WORD newline_list DO list DONE
    |   SELECT WORD newline_list LCURLY list RCURLY
    |   SELECT WORD ';' newline_list DO list DONE
    |   SELECT WORD ';' newline_list LCURLY list RCURLY
    |   SELECT WORD newline_list IN word_list list_terminator newline_list DO list DONE
    |   SELECT WORD newline_list IN word_list list_terminator newline_list LCURLY list RCURLY
    |   SELECT WORD newline_list IN list_terminator newline_list DO compound_list DONE
    |   SELECT WORD newline_list IN list_terminator newline_list LCURLY compound_list RCURLY
    ;
 
case_command:   CASE WORD newline_list IN newline_list ESAC
    |   CASE WORD newline_list IN case_clause_sequence newline_list ESAC
    |   CASE WORD newline_list IN case_clause ESAC
    ;
 
function_def:   WORD '(' ')' newline_list function_body
    |   FUNCTION WORD '(' ')' newline_list function_body
    |   FUNCTION WORD newline_list function_body
    ;
 
function_body:  shell_command
    |   shell_command redirection_list
    ;
 
subshell:   '(' compound_list ')' ;
 
coproc:     COPROC shell_command
    |   COPROC shell_command redirection_list
    |   COPROC WORD shell_command
    |   COPROC WORD shell_command redirection_list
    |   COPROC simple_command
    ;

if_command: IF compound_list THEN compound_list FI
    |   IF compound_list THEN compound_list ELSE compound_list FI
    |   IF compound_list THEN compound_list elif_clause FI
    ;
 
group_command:  LCURLY compound_list RCURLY ;
 
arith_command:  ARITH_CMD ;
 
cond_command:  COND_CMD ;
 
elif_clause:    ELIF compound_list THEN compound_list
    |   ELIF compound_list THEN compound_list ELSE compound_list
    |   ELIF compound_list THEN compound_list elif_clause
    ;
 
case_clause:    pattern_list
    |   case_clause_sequence pattern_list
    ;
 
pattern_list:   newline_list pattern ')' compound_list
    |   newline_list pattern ')' newline_list
    |   newline_list '(' pattern ')' compound_list
    |   newline_list '(' pattern ')' newline_list
    ;
 
case_clause_sequence:  pattern_list SEMI_SEMI
    |   case_clause_sequence pattern_list SEMI_SEMI
    |   pattern_list SEMI_AND
    |   case_clause_sequence pattern_list SEMI_AND
    |   pattern_list SEMI_SEMI_AND
    |   case_clause_sequence pattern_list SEMI_SEMI_AND 
    ;
 
pattern:    WORD
    |   pattern '|' WORD
    ;
 
/* A list allows leading or trailing newlines and
   newlines as operators (equivalent to semicolons).
   It must end with a newline or semicolon.
   Lists are used within commands such as if, for, while.  */
 
list: 	newline_list list0 ;

compound_list:  list
    |   newline_list list1
    ;

list0:      list1 NEWLINE newline_list
    |   list1 '&' newline_list
    |   list1 ';' newline_list
    ;
 
list1:      list1 AND_AND newline_list list1
    |   list1 OR_OR newline_list list1
    |   list1 '&' newline_list list1
    |   list1 ';' newline_list list1
    |   list1 NEWLINE newline_list list1
    |   pipeline_command
    ;

simple_list_terminator: NEWLINE ;

list_terminator: NEWLINE
    |   ';'
    | 	EOF 				// equivalent of yacc_EOF
    ;

newline_list: 
	|   newline_list NEWLINE
	| 	EOF
    ;

/* A simple_list is a list that contains no significant newlines
   and no leading or trailing newlines.  Newlines are allowed
   only following operators, where they are not significant.
 
   This is what an inputunit consists of.  */
 
simple_list:    simple_list1
    |   simple_list1 '&'
    |   simple_list1 ';'
    |   // allow empty lines/items
    ;
 
simple_list1:   simple_list1 AND_AND newline_list simple_list1
    |   simple_list1 OR_OR newline_list simple_list1
    |   simple_list1 '&' simple_list1
    |   simple_list1 ';' simple_list1
    |   pipeline_command
    ;

pipeline_command: pipeline          
    |   BANG pipeline_command
    |   timespec pipeline_command
    |   timespec list_terminator
    |   BANG list_terminator
    ;

pipeline:   pipeline '|' newline_list pipeline
    |   pipeline BAR_AND newline_list pipeline
    |   command
    ;

timespec:   TIME
//    |   TIME '-p' 		// implement as args rather than tokens
//    |   TIME '-p' '--'
    ;

LCURLY : '{' ;
RCURLY : '}' ;
GREATER_GREATER : '>>' ;
GREATER_BAR : '>|' ;
LESS_GREATER : '<>' ;
LESS_LESS : '<<' ;
LESS_LESS_MINUS : '<<-' ;
LESS_LESS_LESS : '<<<' ;
LESS_AND : '<&' ;
GREATER_AND : '>&' ;
AND_GREATER : '&>' ;
AND_GREATER_GREATER : '&>>' ; 

WHILE : 'while' ;
UNTIL : 'until' ;
DO : 'do' ;
DONE : 'done' ;
FOR : 'for' ;
SELECT : 'select' ;
IN : 'in' ;
CASE : 'case' ;
ESAC : 'esac' ;
FUNCTION : 'function' ;
COPROC : 'coproc' ;
IF : 'if' ;
THEN : 'then' ;
FI : 'fi' ;
ELSE : 'else' ;
ELIF : 'elif' ;
ARITH_START : '((' ;
ARITH_END : '))' ;
COND_START : '[' ;
COND_END : ']' ;
SEMI_SEMI : ';;' ;
SEMI_AND : ';&' ;
SEMI_SEMI_AND : ';;&' ;
AND_AND : '&&' ;
OR_OR : '||' ;
BAR_AND : '|&' ;
BANG : '!' ;
TIME : 'time' ;
ASSIGN : '=' ;
QUOTE : '\'' ;
QUOTES : '"' ;
//TIMEOPT : '-p' ;  // better to be implemented in code instead
//TIMEIGN : '--' ;

WS : [ \t]+ -> skip ;
NEWLINE : '\r'? '\n' ;

LINE_COMMENT : '#' ~('\r'|'\n')* -> skip ;
MULTILINE_COMMENT : MULTILINE_START NEWLINE .*? MULTILINE_END -> skip ;
fragment MULTILINE_START : ': \'' ;
fragment MULTILINE_END : '\'\n' ;

/* This is also how the official yacc translates to tokens.
 * However, the specific lexer rules were reverse engineered
 * based on the usage syntax and might be inaccurate since I 
 * couldn't find actual patterns inside the source.
 */
ARITH_CMD : '$'? ARITH_START ~[;)]+ ARITH_END ;	 						// (( arithmetics ))
ARITH_FOR_EXPRS : ARITH_START ~[;)]* ';' ~[;)]* ';' ~[)]* ARITH_END ; 	// (( initialise;check;increment )) 
COND_CMD :  COND_START COND_START ~[\]]* COND_END COND_END				// [[ condition ]]
	| COND_START .*? COND_END 											// [ condition ]
	;
NUMBER : DIGIT+ ;
REDIR_WORD : DIGIT+ ;
ASSIGNMENT_WORD : [a-zA-Z0-9/\-.]~[ \t\r\n;()"]+ ASSIGN WORD ;

fragment DIGIT : [0-9] ;
fragment CHAR : [a-zA-Z] ;
fragment ESC : '\\' [ abtrnf"\\$!] ; 		     // \b, \t, \n etc...
fragment ESC_RESTRICTED : '\\' [abtrnf'\\] ; 
fragment STRING : QUOTES (ESC|.)*? QUOTES ;
fragment ESCAPED_STRING : QUOTE (ESC_RESTRICTED|.)*? QUOTE ;
fragment NESTED_PAREN : '(' NESTED_PAREN ')' 
    | ~[()]*?
    ;
fragment EXPANSION : BRACE_EXPANSION
    | TILDE_EXPANSION
    | PARAM_EXPANSION
    | CMD_SUBSTITUTION
    | ARITH_CMD                        // arithmetic expansion
	| '*' ~[ \t\r\n;")]*               // pathname expansion
	;

WORD : DIGIT
    | CHAR
    | STRING
    | ESCAPED_STRING                    // all expansions suppressed
    | EXPANSION
    | [a-zA-Z0-9/\-.]~[ \t\r\n;()"]+
    ;

/* Tilde expansion */
fragment TILDE_EXPANSION : '~' [+-]? (DIGIT|NUMBER)   // dirs +-N
    | '~' [+-]? ([a-zA-Z_/*.]+ | STRING)*             // specific path
    ;

/* Parameter expansion */
fragment PARAM_EXPANSION : '${' ('\\}'|~[}])+ '}'      
    | '$' ~[ \t\r\n;")]*
    ;

/* Command substitution */
fragment CMD_SUBSTITUTION : '$(' ~[()]+ ')'
    | '`' ('\\`'|~[`])+ '`'
    ;

/* Brace expansions
 * Allows us to recognize complete brace expansions and return
 * them as a single token, so that another parser can convert
 * accordingly. Hence in our case, we only need to recognize 
 * brace expansions during the lexing phase.
 */
fragment BRACE_EXPANSION : INITIAL_PREAMBLE? INNER_BRACE_EXPANSION INITIAL_POSTSCRIPT? ;
fragment INITIAL_PREAMBLE : ~[ {};\t\r\n]+ ;    // no spaces outside of first {} allowed
fragment INITIAL_POSTSCRIPT : ~[ #\t\r\n]+ ;
fragment INNER_BRACE_EXPANSION : LCURLY (RANGE|CSV) RCURLY ;
fragment RANGE : (NUMBER|DIGIT|CHAR) '..' (NUMBER|DIGIT|CHAR) ('..' (NUMBER|DIGIT))? ;
fragment CSV : PREAMBLE (',' CSV)+ 
    | POSTSCRIPT
    ;
fragment PREAMBLE : (CHAR|DIGIT|~[{}\r\n])+ ;   // nested preamble/words allow spaces
fragment POSTSCRIPT : PREAMBLE? INNER_BRACE_EXPANSION POSTSCRIPT?
    | ~[,{};\n\r]+
    ;
