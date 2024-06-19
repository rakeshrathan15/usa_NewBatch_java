package swiggy.service;

import swiggy.model.Menu;
import swiggy.model.OTP;
import swiggy.model.Restaurant;
import swiggy.model.User;

public class SwiggyTest {

    public static void main(String[] args) {

        User user = new User();
        user.mobileNumber = "123456";
        user.name = "Neoteric";

        Restaurant r = new Restaurant();
        r.user = user;
        Menu m = new Menu();

        r.restaurantName = "KFC";
        r.restaurantName.toLowerCase();
        r.flatNo = "1-106";
        r.street = "balaji nagar";
        r.city = "hyd";
        r.state = "TG";
        r.pincode = "508212";

        m.dishName = "Briyani";
        m.price = 300;
        m.status = true;

        r.menu = m;
        r.user=user;

        SwiggyService service = new SwiggyService();
        OTP testOTP = service.registerRestaurant(r);

        OTP inputOTP = testOTP;

        String response = service.otpValidation(inputOTP, r.user);
        System.out.println("response " + response);

        System.out.println("OTP number " + testOTP.number);
        System.out.println("OTP creationDate " + testOTP.creationdate);
        System.out.println("OTP expriyDate " + testOTP.expiryDate);


    }
}