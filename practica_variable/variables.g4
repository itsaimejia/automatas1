
/*Crear una gramaica que sea capaz de detectar si una variable está bien declarada*/
/*Utilizando los tipos de datos: */

grammar variables;

variables   : estructura;
estructura  : 
            INT NOMBRE
            {
                ValidateVar v = new ValidateVar($NOMBRE.text);
                if(v.valid())
                    System.out.println("Declaracion sin errores");
                else
                    System.out.println("ERROR");
            } 
            |
            FLOAT NOMBRE
            {
                ValidateVar v = new ValidateVar($NOMBRE.text);
                if(v.valid())
                    System.out.println("Declaracion sin errores");
                else
                    System.out.println("ERROR");
            } 
            |
            CHAR NOMBRE
            {
                ValidateVar v = new ValidateVar($NOMBRE.text);
                if(v.valid())
                    System.out.println("Declaracion sin errores");
                else
                    System.out.println("ERROR");
            } 
            |
            BOOLEAN NOMBRE
            {
                ValidateVar v = new ValidateVar($NOMBRE.text);
                if(v.valid())
                    System.out.println("Declaracion sin errores");
                else
                    System.out.println("ERROR");
            } 
            |
            DOUBLE NOMBRE
            {
                ValidateVar v = new ValidateVar($NOMBRE.text);
                if(v.valid())
                    System.out.println("Declaracion sin errores");
                else
                    System.out.println("ERROR");
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