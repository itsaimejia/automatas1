grammar lenguaje;

/*crear una plantilla para verificar si una busqueda simple*/
/* en MySQL*/

/*p.e. SELECT operacion FROM NOMBRE_BD sentencia_final */

busqueda        : 
                SELECT operacion FROM nombre_tabla sentencia_final
                |
                UPDATE nombre_tabla SET nombre_columna '=' argumento WHERE condicion sentencia_final
                |
                DELETE FROM nombre_tabla WHERE condicion sentencia_final
                |
                INSERT INTO nombre_tabla VALUES '(' argumento ')' sentencia_final
                |
                CREATE DATABASE nombre_bd sentencia_final
        ;
nombre_tabla    : ID;

nombre_columna  : ID;    

nombre_bd       : ID;

argumento       : CANTIDAD | ID;

operacion       : ASTERISCO | ID;

sentencia_final : SEMI?;

condicion       : ID '=' argumento;

SELECT      : 'SELECT' | 'select';
UPDATE      : 'UPDATE' | 'update';
DELETE      : 'DELETE' | 'delete';
INSERT      : 'INSERT' | 'insert';
CREATE      : 'CREATE' | 'create';

FROM        : 'FROM' | 'from';
WHERE       : 'WHERE' | 'where';
SET         : 'SET' | 'set';
INTO        : 'INTO' | 'into';
VALUES      : 'VALUES' | 'values';
DATABASE    : 'DATABASE' | 'database';

ASTERISCO   : '*';
SEMI        : ';';

fragment
LETRA       : [a-zA-Z_];
fragment
CONTENIDO   : [a-zA-Z0-9_ ]+;
ID          : LETRA CONTENIDO;

CANTIDAD    : [0-9]+([\\.][0-9]+)?;

ESPACION    : [ ] -> skip;
ENTER       : [\r\n] ->skip;

