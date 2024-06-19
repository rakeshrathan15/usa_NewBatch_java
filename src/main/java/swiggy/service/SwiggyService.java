package swiggy.service;

import swiggy.model.OTP;
import swiggy.model.Restaurant;
import swiggy.model.User;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class SwiggyService {


         public static Restaurant restaurantStaticVariable;

         public OTP otp;


         public OTP registerRestaurant(Restaurant rrr){

              restaurantStaticVariable=rrr;
              OTPService otpService=new OTPService();
              OTP responseOTP=otpService.generatedOTP(rrr.user);
               return responseOTP;

         }



//    Restaurant getRestaurant(String restaurantName){
//
//
//
//    }
//        public boolean validateOtp(){
//        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("OTP is :" );
//        String otp = scanner.nextLine();
//        System.out.println(otp);
//        System.out.println(gengratedOTP.hashCode());
//        if(otp.equals(gengratedOTP.number)){
//            System.out.println("Otp is valid");
//            return true;
//        } else {
//            System.out.println("Otp is not valid");
//            return false;
//        }
//
//
//    }

    String otpValidation(OTP inputOtp, User user){
            OTPService otpService=new OTPService();

             return otpService.otpValidation(inputOtp,user);
    }




}
