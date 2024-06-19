package bank;

public class LoginTest {


    public static void main(String[] args) {

        User user = new User();
        user.userName="rakesh";
        user.password="123";


        LoginService loginService = new LoginService();
        loginService.validateLogin(user);

        System.out.println(loginService.validateLogin(user)); // Attempt 1
        System.out.println(loginService.validateLogin(user)); // Attempt 2
        System.out.println(loginService.validateLogin(user)); // Attempt 3
        System.out.println(loginService.validateLogin(user));

    }
}
