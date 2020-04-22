grammar password;

/*
Reglas para gestionar el password
1.- Aceptar al menos una letra Mayuscula en cualquier posicion
2.- La longitud del password debera ser de 8 caracteres maximo y minimo de 6

*/

password: w= BASE
        {
            VerifyP v = new VerifyP($w.text);
            v.valid();
        };

BASE    : [a-zA-Z0-9]+;
WS      : [ \t\n\r]+ ->skip; 