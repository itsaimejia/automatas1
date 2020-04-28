public class ValidateVar{

    private String type_var;
    private String name;

    public ValidateVar(String type_var, String name) {
        this.name=name;
        this.type_var=type_var;
    }

    public boolean valid(){
        return (
        typeExist() &&
        name.length() > 0 &&
        firstIsNotNumber() &&
        notRandomChar());                  
    }

    private boolean typeExist(){
        boolean r=false;
        switch(type_var){
            case "int":
            case "float":
            case "boolean":
            case "double":
            case "char":
                r=true;
            break;
            default:
                r=false;
        }
        return r;
    }
    private boolean firstIsNotNumber(){
        return !(Character.isDigit(name.charAt(0)));
    }

    private boolean notRandomChar(){
        char[] array= name.toCharArray();
        int char_val=0;
        for (char c : array) {
            if(Character.isLetter(c)|| Character.isDigit(c)|| c=='_' || c==';')
                char_val++;
        }

        return array.length == char_val;
    }    
}