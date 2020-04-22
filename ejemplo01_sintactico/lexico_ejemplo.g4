lexer grammar lexico_ejemplo;

fragment 
DIGITO      : [0-9];

FLOTANTE    : DIGITO+ '.' DIGITO+;
ENTERO      : DIGITO+;


BOOLEAN     : 'true' | 'false';

fragment
PALABRA :[a-zA-Z0-9];

CHAR    : PALABRA;
ID      : [a-z]+;

COMMENT_LINE    : '//'.*? -> channel(HIDDEN);
COMMENT_BLOCK   : '/*'.*?'/*' -> channel(HIDDEN);




