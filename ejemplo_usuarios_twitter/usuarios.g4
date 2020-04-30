grammar usuarios;

//@Texto
//Reglas para el texto
/*1.- Tener menos de 15 caracteres*/
/*2.- No contener la palabra admin o twitter*/

//Sintaxis: @ nombre_usuario
//nombre: 
    //1.-hacer la validacion a traves de la programacion
    //2.- Verificar que no contenga la palabra admin o twitter 

nombre_usuario  : ARROBA u=USERNAME ENTER
                {
                    VerifyUser user= new VerifyUser($u.text);
                    user.valid();
                }
            ;
ARROBA      : '@';
USERNAME   : [a-zA-Z0-9_]+;

ENTER       : [\r\n];
WS          : [ ] -> skip;