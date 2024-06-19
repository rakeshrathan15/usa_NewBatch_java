package swiggy.service;

import swiggy.model.OTP;
import swiggy.model.User;

import java.util.Date;
import java.util.UUID;

public class OTPService {
    public User userInstance;

    public OTP otpInstance;

    public OTP generatedOTP(User inputUser){
        userInstance = inputUser;
        OTP aaa= new OTP();
        aaa.number= UUID.randomUUID().toString();
        aaa.creationdate=new Date();
        long currentTimeInMills = aaa.creationdate.getTime();
        //15 mins -> 900sec -> 900*1000 = 900000
        long endTimeMills = currentTimeInMills+900000;
        aaa.expiryDate=new Date(endTimeMills);
        otpInstance=aaa;

        return aaa;
    }

    String otpValidation(OTP inputOtp, User inputUser){
        if(inputOtp.number.equals(otpInstance.number)   &&
                inputUser.mobileNumber.equals(otpInstance.mobileNumber)){
            return "OTP Validation is successful";
        }else {
            return "Invalid OTP";
        }
    }

}
