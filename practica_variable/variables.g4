
/*Crear una gramaica que sea capaz de detectar si una variable está bien declarada*/
/*Utilizando los tipos de datos: */

grammar variables;

variables   : estructura;
estructura  : 
            INT NOMBRE
            {
                ValidateVar v = new ValidateVar($INT.text, $NOMBRE.text);
                v.valid();
            } 
            |
            FLOAT NOMBRE
            {
                ValidateVar v = new ValidateVar($FLOAT.text, $NOMBRE.text);
                v.valid();
            } 
            |
            CHAR NOMBRE
            {
                ValidateVar v = new ValidateVar($CHAR.text, $NOMBRE.text);
                v.valid();
            } 
            |
            BOOLEAN NOMBRE
            {
                ValidateVar v = new ValidateVar($BOOLEAN.text, $NOMBRE.text);
                v.valid();
            } 
            |
            DOUBLE NOMBRE
            {
                ValidateVar v = new ValidateVar($DOUBLE.text, $NOMBRE.text);
                v.valid();
            }
            |
            {
                System.out.println("ERROR");
            }
        ;

INT     : 'int';
CHAR    : 'char';   
FLOAT   : 'float';
BOOLEAN : 'boolean';
DOUBLE  : 'double';
NOMBRE  : [a-zA-Z0-9_]+ PC;
PC      : ';';

ENTER       : [\r\n];
ESPACIOS    : [ ] -> skip;