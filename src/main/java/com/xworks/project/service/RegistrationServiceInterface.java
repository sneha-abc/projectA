package com.xworks.project.service;

import com.xworks.project.dto.RegistrationDto;
import com.xworks.project.entity.LogInEntity;
import org.springframework.web.multipart.MultipartFile;

public interface RegistrationServiceInterface {

    boolean saveRegistrationData(RegistrationDto registrationDto);

    RegistrationDto fingByEmailId(String emailId);

    RegistrationDto fingByMobileNo(long contactNumber);

    boolean login(String emailId,String password);

     boolean saveOtp(String otp,String emailId);

     boolean verifyOtp(String emailId,String otp);

     boolean resetPassword(String emailId ,String password,String confirmPassword);

     RegistrationDto loginEnitity(String emailId);

     void logout(String emailId);

     boolean saveUpdate(RegistrationDto registrationDto, MultipartFile multipartFile);


}
