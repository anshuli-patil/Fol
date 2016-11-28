grammar Fol;

// Lexer Rules

VARIABLE
:
	[a-z]+
;

WHITESPACE
:
	[ \t\r\n\u000C]+ -> skip
;

OPENING_BRACKET
:
	'('
;

CLOSING_BRACKET
:
	')'
;

AND
:
	'&'
;

OR
:
	'|'
;

NOT
:
	'~'
;

COMMA
:
	','
;

IMPLIES
:
	'=>'
;

CONSTANT
:
	[A-Z] [a-z]*
;

// Parser rules

sentence
:
	complexSentence
	| literal
;

complexSentence
:
	implicationSentence
	| notSentence
	| andOrSentence
;

implicationSentence
:
	OPENING_BRACKET sentence IMPLIES sentence CLOSING_BRACKET
;

//notSentence: 	OPENING_BRACKET NOT sentence  CLOSING_BRACKET;

notSentence
:
	OPENING_BRACKET NOT notSentence CLOSING_BRACKET
	| OPENING_BRACKET NOT andOrSentence CLOSING_BRACKET
	| OPENING_BRACKET NOT literal CLOSING_BRACKET
	| OPENING_BRACKET NOT sentence CLOSING_BRACKET
;

andOrSentence
:
	OPENING_BRACKET literal operator literal CLOSING_BRACKET
	| OPENING_BRACKET andOrSentence operator andOrSentence CLOSING_BRACKET
	| OPENING_BRACKET andOrSentence operator literal CLOSING_BRACKET
	| OPENING_BRACKET literal operator andOrSentence CLOSING_BRACKET
	| OPENING_BRACKET sentence operator sentence CLOSING_BRACKET
;

operator
:
	AND
	| OR
;

literal
:
	CONSTANT OPENING_BRACKET listPredicates CLOSING_BRACKET
	| NOT CONSTANT OPENING_BRACKET listPredicates CLOSING_BRACKET
;

listPredicates
:
	VARIABLE COMMA listPredicates
	| VARIABLE
	| CONSTANT COMMA listPredicates
	| CONSTANT
; 
