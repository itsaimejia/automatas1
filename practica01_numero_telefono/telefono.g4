grammar telefono;

/*crea una gramatica que sea capaz de pedir un numero*/
/* con el siguiente formato (xxx)-(xxxxxx) */

varios              : numero_telefonico+;
numero_telefonico   : '(' DIGITO DIGITO DIGITO ')' '-' '(' DIGITO DIGITO DIGITO DIGITO DIGITO DIGITO ')';


DIGITO  : [0-9];

ESPACIOS: [ \r\n] -> skip;