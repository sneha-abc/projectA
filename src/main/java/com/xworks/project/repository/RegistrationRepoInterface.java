package com.xworks.project.repository;

import com.xworks.project.entity.LogInEntity;
import com.xworks.project.entity.RegistrationEntity;

public interface RegistrationRepoInterface {
    boolean saveRegistrationData(RegistrationEntity registrationEntity);

    RegistrationEntity findByEmailId(String emailId);

    RegistrationEntity findByMobileNo(long contactNumber);

    void login(LogInEntity logInEntity);

    void loginUpdate(RegistrationEntity registrationEntity);

    void saveOtp (RegistrationEntity registrationEntity);

    void resetPassword(RegistrationEntity registrationEntity);

    LogInEntity findLoginDetails(String emailId);

    void logout(LogInEntity logInEntity);

    void updateData(RegistrationEntity registrationEntity);

}
