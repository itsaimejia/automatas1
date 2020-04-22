
grammar binario_decimal;

/*Crear una gramatica que sea capaz de leer un numero binario y mostrar su valor en numero decimal*/
varios      : convertir+;   
convertir   :  n= BINARIO
            {
                ToDecimal decimal= new ToDecimal($n.getText());
                System.out.println("El valor de "+$n.getText()+" en decimal es: "+decimal.decimal());
            };

BINARIO     :[01]+;
WS          :[ \t\r\n]->skip;