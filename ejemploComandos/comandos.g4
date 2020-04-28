grammar comandos;

comandos: consola;

consola : CD RUTA ENTER
        {
            System.out.println($CD.text);
            System.out.println("El comando cd se utiliza para acceder a directorios dentro de los SO");
            System.out.println("El comando que usted ingreso es: "+$CD.text+" "+$RUTA.text);
            System.out.println($CD.text +" "+ $RUTA.text);
        }
        |
        DIR RUTA? ENTER
        {
            System.out.println("El comando lista el contenido del directorio o carpeta donde te encuentras, mostrando todas las subcarpetas o archivos que tiene. Con este comando podrás saber si el archivo que buscas está ahí o a qué subcarpeta navegar.");
            System.out.println("El comando que usted ingreso es: "+$DIR.text);
            System.out.println($DIR.text+" "+$RUTA.text);
        }
        |
        TREE RUTA ENTER
        {
            System.out.println("Te muestra el árbol de directorios de una carpeta concreta que le digas");
            System.out.println("El comando que usted ingreso es: "+$TREE.text);
            System.out.println($TREE.text +" "+ $RUTA.text);
        }
        |
        CLS
        {
            System.out.println("Limpia la ventana de la consola de Windows, borrando todo lo que se ha escrito en ella, tanto tus comandos como las respuestas de la propia consola. Se quedará todo como si la acabases de abrir de nuevo.");
            System.out.println("El comando que usted ingreso es: "+$CLS.text);
            System.out.println($CLS.text);
        }
        |
        EXIT
        {
            System.out.println("Cierra la ventana de la consola de Windows.");
            System.out.println("El comando que usted ingreso es: "+$EXIT.text);
            System.out.println($EXIT.text);
        }
        |
        {
            System.out.println("No hay comando disponible");
        }

    ;

CD          : 'cd';
DIR         : 'dir';
TREE        : 'tree';
CLS         : 'cls';
EXIT        : 'exit';
RUTA        : [a-zA-Z0-9-]+;
ENTER       : [\r\n];
ESPACIOS    : [ ] -> skip;