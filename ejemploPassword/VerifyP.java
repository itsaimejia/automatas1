public class VerifyP{

    private String pass;

    public VerifyP(String pass){
        this.pass=pass; 
    }

    public boolean valid_size(){    
        return pass.length()<=8 && pass.length() >= 6;
    }

    public void valid(){
        if(valid_size()){
            char[] items= pass.toCharArray();
            int min=0;
            int mayus=0;
            int num=0;
            int cant=0;
            for (char c : items) {
                if(Character.isUpperCase(c))
                    mayus++;
                if(!Character.isUpperCase(c) && !Character.isDigit(c)){
                    min++;
                }  
                if(Character.isDigit(c))
                    num++;
                
                cant++;
            }
            if(mayus==0||min==0||num==0){
                message("Invalido",cant, mayus, min, num);
            }else{
                message("Valido",cant,mayus,min,num);
            }
        }else{
            System.out.println("Invalido\nLa longitud es erronea: "+pass.length()+"\nMaximo 8 caracteres\nMinimo 6 caracteres");
        }
    }

    public void message(String val,int cant, int mayus, int min, int num){
        System.out.println("Password: " +val);
        System.out.println("Cantidad de letras: "+cant);
        System.out.println("Cantidad de mayusculas: "+mayus);
        System.out.println("Cantidad de minusculas: "+min);
        System.out.println("Cantidad de numeros: "+num);
    }

}