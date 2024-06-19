package swiggymodel;

public class SwiggyTest {
    public static void main(String[] args) {
        SwiggyService swiggyService = new SwiggyService();

      //  Restaurant restaurant = new Restaurant();
       // Menu menu = new Menu();
        Restaurant restaurant=new Restaurant();
        Menu menu=new Menu();

        restaurant.restaurantName = "KFC";
        restaurant.flatNo = "123";
        restaurant.city = "hyd";
        restaurant.street = "kphb";
        restaurant.state = "ts";
        restaurant.pincode = "508212";

        menu.dishName = "biryani";
        menu.price = 250;
        menu.status = true;

        restaurant.menu=menu;

        // Register the restaurant and get the OTP
        OTP otp = swiggyService.registerRestaurant(restaurant);
        System.out.println("OTP for " + restaurant.restaurantName + ": " + otp.otpCode);

        // Verify OTP
        boolean isVerified = swiggyService.verifyOTP(otp, otp.otpCode);
        System.out.println("OTP verified: " + isVerified);

        // Retrieve the restaurant details
        Restaurant retrievedRestaurant = swiggyService.getRestaurant(restaurant, restaurant.restaurantName);
        if (retrievedRestaurant != null) {
            System.out.println("Retrieved Restaurant Name: " + retrievedRestaurant.restaurantName);
        } else {
            System.out.println("Restaurant not found");
        }
    }
}
