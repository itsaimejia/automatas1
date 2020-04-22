/*Esta gramatica sera capaz de mostrar al usuario informacion procesada*/

grammar mensajes;

name    : ID
        {
            System.out.println("El lexema del token ID es: "+ $ID.getText());
        };

ID      : [a-zA-Z]+;
WS      : [ \r\t\n]->skip;