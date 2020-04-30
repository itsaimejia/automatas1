import java.util.regex.*;
public class VerifyUser {

    private String user;

    public VerifyUser(String user) {
        this.user=user;
    }

    public void valid(){
        if(user.length() >= 15){
            System.out.println("No puede superar \nlos 15 caracteres");
            System.exit(-1);
        }
        else
        if(ForbiddenWords()){
            System.out.println("admin y twitter no se aceptan ");
            System.exit(-1);
        }
        else
            System.out.println("Usuario valido");
    }

    private boolean ForbiddenWords(){
        Pattern p = Pattern.compile("admin|twitter");
        Matcher m = p.matcher(user.toLowerCase());
        return m.find();
    }
}