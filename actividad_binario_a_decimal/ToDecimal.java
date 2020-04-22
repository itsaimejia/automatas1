public class ToDecimal{

    private String number;
    /*Constructor que acepta un parametro tipo String*/
    public ToDecimal(String number) {
        this.number=number;
    }
    /*Metodo que convierte un valor binario a decimal*/
    public int decimal(){
        //Separa cada numero
        String [] vect = number.split("");
        //Varible que obtendra el valor final
        int decimal=0;
        //valor del exponente por el que se multiplicara cada numero
        int exp=1;
        //ciclo que recorre la lista de numeros y suma los valores correspondientes
        for(int i=number.length()-1; i>=0; i--){            
            decimal+=Integer.parseInt(vect[i])*exp;
            exp*=2;
        }
        return decimal;
    }
                
}