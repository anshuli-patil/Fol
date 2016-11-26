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

sentence: complexSentence
	|	literal
	;

complexSentence: implicationSentence
	|	notSentence
	|	andSentence
	|	orSentence
	;

implicationSentence: OPENING_BRACKET sentence IMPLIES sentence CLOSING_BRACKET;
	
notSentence: 	OPENING_BRACKET NOT sentence  CLOSING_BRACKET;                    
	
andSentence:	OPENING_BRACKET sentence AND sentence    CLOSING_BRACKET;        
	
orSentence:	OPENING_BRACKET sentence OR sentence    CLOSING_BRACKET;

literal: CONSTANT OPENING_BRACKET listPredicates CLOSING_BRACKET  

	|	NOT CONSTANT OPENING_BRACKET listPredicates CLOSING_BRACKET         
	;

listPredicates: VARIABLE COMMA listPredicates           
	
	|	VARIABLE                                        
	  
	|	CONSTANT COMMA listPredicates              
	
	|	CONSTANT                                  
	; 
