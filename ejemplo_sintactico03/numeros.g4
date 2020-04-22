/*Esta gramatica enviara los lexemas a una clase
para que sean procesados */

grammar numeros;

numeros:    a= NUMBER b= NUMBER
            {
                Suma suma= new Suma(Integer.parseInt($a.text),Integer.parseInt($b.text));
                System.out.println($a.getText() +" + "+ $b.text +" = "+ suma.sumar());
            };

NUMBER  : [0-9]+;
WS      : [ \t\r\n]->skip;