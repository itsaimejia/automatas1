public class ValidateVar{
    private String name;

    public ValidateVar(String name) {
        this.name=name;
    }

    public boolean valid(){
        return (
        name.length() > 0 &&
        firstIsNotNumber() &&
        notRandomChar());                  
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