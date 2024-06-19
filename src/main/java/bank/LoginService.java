package bank;

public class LoginService {

    public  String username="rakesh";
    public String password="1234";

    public static int maxAttempts=3;


   public String validateLogin(User user){

       if (user.locked) {
           return "Your account is locked due to multiple failed login attempts.";
       }

        if(this.username.equals(user.userName) && this.password.equals(user.password)){
            user.count = 0;
            return "You are sucessfully login";

        } else {
            user.count=user.count+1;
            if (user.count >= maxAttempts) {
                user.locked = true;
              // return "Your account is locked due to multiple failed login attempts.";
            }
            return "Your username and password are wrong."+(maxAttempts-user.count);
        }

    }
}
