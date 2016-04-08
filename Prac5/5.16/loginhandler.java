package action;
public class LoginHandler {
    boolean authenticate(String name,String pwd){
        if(name.equals("bhargavi")&& pwd.equals("abcde")){
            return true;
        }
        return false;
    }
}
