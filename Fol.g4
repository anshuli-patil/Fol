grammar Fol;     
 
// Lexer Rules

VARIABLE        : [a-z]+ ;
WHITESPACE      : [ \t\r\n\u000C]+ -> skip ;

OPENING_BRACKET : '(' ;
CLOSING_BRACKET : ')' ;
AND             : '&' ;
OR              : '|' ;
NOT             : '~' ;
COMMA           : ',' ;
IMPLIES         : '=>';

CONSTANT        : [A-Z][a-z]* ;       


// Parser rules

sentence: complex_sentence
	|	literal
	;

complex_sentence: implication_sentence
	|	not_sentence
	|	and_sentence
	|	or_sentence
	;

implication_sentence: OPENING_BRACKET sentence IMPLIES sentence CLOSING_BRACKET	;
	
not_sentence: 	OPENING_BRACKET NOT sentence  CLOSING_BRACKET;                    
	
and_sentence:	OPENING_BRACKET sentence AND sentence    CLOSING_BRACKET;        
	
or_sentence:	OPENING_BRACKET sentence OR sentence    CLOSING_BRACKET;

literal: CONSTANT OPENING_BRACKET list_predicates CLOSING_BRACKET  

	|	NOT CONSTANT OPENING_BRACKET list_predicates CLOSING_BRACKET         
	;

list_predicates: VARIABLE COMMA list_predicates           
	
	|	VARIABLE                                        
	  
	|	CONSTANT COMMA list_predicates              
	
	|	CONSTANT                                  
	; 
