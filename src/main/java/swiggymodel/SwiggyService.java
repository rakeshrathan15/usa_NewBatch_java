package swiggymodel;

public class SwiggyService {
    OTP registerRestaurant(Restaurant restaurant) {
        OTP otp = new OTP();
        otp.otpCode = generateOTP();
        System.out.println("Restaurant registered: " + restaurant.restaurantName);
        return otp;
    }

    Restaurant getRestaurant(Restaurant restaurant, String restaurantName) {
        if (restaurant != null && restaurant.restaurantName.equals(restaurantName)) {
            return restaurant;
        }
        return null;
    }

    private String generateOTP() {
        // Generate a simple 6-digit OTP
        return String.valueOf((int) (Math.random() * 900000) + 100000);
    }

    boolean verifyOTP(OTP otp, String inputOTP) {
        return otp != null && otp.otpCode.equals(inputOTP);
    }
}
