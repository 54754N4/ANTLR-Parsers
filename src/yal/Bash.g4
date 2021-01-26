/** Aliases defined inside powershell profile.
  * To build + compile :
  * 	$ antlrf .\Bash.g4
  * To test :
  * 	$ grun Bash <production_rule_start>
  * Or to list matched tokens : 
  * 	$ grun Bash <producion_rule_start> -Target tokens
  * Book references :
  * - p58 references how to implement listeners + walk tree
  */
grammar Bash;

program : statements EOF ;

statements : (statement? TERMINATOR)+ ;

statementList : statement (COMMA statement)* ;

statement : atom 												# AtomExecution	
	| statement (AND_AND|OR_OR) statement						# ConditionalStatement
	|<assoc=right> statement redirectionOperator statement 		# RedirectionStatement
	;

atomList : atom (COMMA atom)* ;

atom : (CONTINUE|REPEAT|BREAK)
	| block
	| variableDeclaration
	| assignment
	| branchStatement
	| whileStatement
	| forStatement
	| returnStatement
	| expression
	;

expression : functionDeclaration				# FunctionDefinition
	| lambdaDeclaration							# LambdaDefinition
	| arithmetic 								# ArithmeticExpression
	| command 									# CommandExpression
	;

// Commands

command : WORD parameterList? ;

parameterList : parameter (SPACE parameter)* ;

parameter : unnamedParameter
	| namedParameter
	| STRING
	| WORD
	;

unnamedParameter : SUB WORD ;

namedParameter : SUB SUB WORD (ASSIGN value)? ;

value : STRING | WORD ;

redirectionOperator : INT? LT WORD?  			// receive from in
	| INT? GT OR? WORD? 						// overwrite with out
	| INT? GT GT WORD? 							// append with out
	| AND GT WORD? 								// overwite with in/out
	| AND GT GT WORD?        					// append with in/out
	| INT? LT AND (WORD?|SUB)             		// duplicate or close in
	| INT? GT AND (WORD?|SUB) 					// duplicate or close out
	| INT? LT AND INT SUB 						// move in
	| INT? GT AND INT SUB 						// move out
	| INT? LT GT WORD?							// R/W
	;

// Control flow

branchStatement : IF expression block (ELIF block)* (ELSE block)? ;

whileStatement : WHILE expression block 										# While
	| DO block WHILE expression 												# DoWhile
	;

forStatement : FOR LPAREN WORD IN expression RPAREN block 						# ForEach
	| FOR LPAREN assignmentList SEMI expression SEMI atomList RPAREN block 		# For
	;

/*  TO-DO :
	- switch/with (arrow or colon notation + default)
*/

// Functions

returnStatement : RETURN statementList? ;

functionDeclaration : WORD LPAREN formalParameters? RPAREN COLON typeList block // takes a block of statements
	| WORD LPAREN formalParameters? RPAREN ARROW statement 						// 1 liner: only 1 statement
	;

lambdaDeclaration : LPAREN unformalParameters? RPAREN ARROW block
	| unformalParameters? ARROW block
	| LPAREN unformalParameters? RPAREN ARROW statementList
	| unformalParameters? ARROW statementList
	;

formalParameters : formalParameter (COMMA formalParameter)* ;

formalParameter : WORD COLON type 			# FormalParmater
	| WORD ELLIPSIS type 					# VariableArityParameter
	;

unformalParameters : WORD (COMMA WORD)* ;

block : LBRACE statements? RBRACE ;

typeList : type (COMMA type)* ;

// Assignment

variableDeclaration : (VAR|VAL)? WORD (TERMINATOR | ASSIGN expression) ;

assignmentList : assignment (COMMA assignment)* ;

assignment : WORD assignmentOperator assignment 
	| expression
	;

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

// Arithmetic

arithmeticList : arithmetic (COMMA arithmetic)* ;

arithmetic : WORD LPAREN arithmeticList? RPAREN 					# Function
	| arithmetic COLON arithmetic (COLON arithmetic)?				# Range
	|<assoc=right> arithmetic POW arithmetic						# Power
	| (TILDE|ADD|SUB|INC|DEC) arithmetic 							# Prefix
	| arithmetic (INC|DEC)											# Postfix
	| arithmetic (MUL|DIV) arithmetic								# MultDiv
	| arithmetic (ADD|SUB) arithmetic								# AddSub
	| arithmetic (OR|XOR|AND) arithmetic							# BitOp
	|<assoc=right> arithmetic MOD arithmetic						# Modulus		
	| arithmetic (AND_AND|OR_OR) arithmetic							# LogicalAndOr
	| arithmetic (LT|LE|GT|GE) arithmetic 							# RelativeComparison
	| arithmetic (EQUAL|NOT_EQUAL) arithmetic						# EqualityComparison
	|<assoc=right> arithmetic QUESTION arithmetic COLON arithmetic 	# Ternary 
	|<assoc=right> arithmetic (LSHIFT|RSHIFT|URSHIFT) arithmetic	# Shift
	| NOT arithmetic												# LogicalNot
	| constant 														# ArithmeticConstant
	| LPAREN arithmetic RPAREN 										# NestedArithmetic
	;

constant : string
	| CHAR
	| TRUE
	| FALSE
	| PI 
	| EXP
	| FLOAT
	| WORD
	| INT
	;

string : PATH_STRING		# PathString
	| FORMAT_STRING 		# FormatString
	| STRING 				# DefaultString
	;

// Data structures

/*
array : LBRACK expression RBRACK
row : expression (COMMA expression)*

complex : complex ((ADD|SUB) (I complex|complex I)) 
	| arithmetic ;
*/


// Reserved types and keywords 

type : 'str' | 'float' | 'int' | 'char' | 'void' ;

TRUE : 'true' ;
FALSE : 'false' ;
VAR : 'var' ;
VAL : 'val' ;
IF : 'if' ;
ELIF : 'elif' ;
ELSE : 'else' ;
RETURN : 'return' ;
WHILE : 'while' ;
DO : 'do' ;
FOR : 'for' ;
IN : 'in' ;
REPEAT : 'repeat' ;
CONTINUE : 'continue' ;
BREAK : 'break' ;
DEFAULT_CASE : '_' ;
TERMINATOR : SEMI NEWLINE | SEMI | NEWLINE ;

// Data types

PATH_STRING : 'p' STRING ;
FORMAT_STRING : 'f' STRING ;
STRING : QUOTES (ESC|.)*? QUOTES ;	// non-greedy capture

CHAR : QUOTE ALPHANUMERAL+ QUOTE 
	| DIGIT+ 'c'
	;
WORD : [a-zA-Z0-9_]+ ;
FLOAT : SUB? INT DOT? INT?
	| SUB? INT 'f' ;
INT : SUB? DIGIT+ ;
PI : [Pp][Ii] ;
EXP : [Ee] ;

NEWLINE : '\r'? '\n' ;
WS : [ \t\r\n]+ -> skip ;
SPACE : ' ' ;

// Fragments

fragment ALPHANUMERAL : [a-zA-Z] | DIGIT ;
fragment NOT_SEPARATOR : ~[<>&|;,] ;
fragment DIGIT : [0-9] ;
fragment ESC : '\\' [btnr"\\] ; 			// \b, \t, \n etc...

// Language Constants

LPAREN : '(' ;
RPAREN : ')' ;
LBRACE : '{' ;
RBRACE : '}' ;
LBRACK : '[' ;
RBRACK : ']' ;
SEMI : ';' ;
COMMA : ',' ;
ELLIPSIS : '...' ;
COLON_COLON : '::' ;
DOT : '.' ;
QUOTES : '"' ;
QUOTE : '\'' ; 
AT : '@' ;
ASSIGN : '=' ;
GT : '>' ;
LT : '<' ;
NOT : '!' ;
TILDE : '~' ;
QUESTION : '?' ;
COLON : ':' ;
ARROW : '->' ;
EQUAL : '==' ;
LE : '<=' ;
GE : '>=' ;
NOT_EQUAL : '!=' ;
AND_AND : '&&' ;
OR_OR : '||' ;
INC : '++' ;
DEC : '--' ;
ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
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

// Comments

BLOCK_COMMENT : '/*' .*? '*/' -> skip ;	// or send to -> channel(HIDDEN)
LINE_COMMENT : '//' ~[\r\n]* -> skip ;

/*  Test code language :

var a = 2; cos(2*3^4+log(0))
a /= 3
alert(args...int) -> echo(args,"and some bullshit")
a,b,c,d -> 1+2+3+4+a*b*c*d
-> 1+4+3,1+2,4
echo -unnamed --named --named=value --named="swe wer\""

*/