package com.xworks.project.service;

import com.sun.org.apache.xpath.internal.operations.Mult;
import com.xworks.project.dto.RegistrationDto;
import com.xworks.project.entity.LogInEntity;
import com.xworks.project.entity.RegistrationEntity;
import com.xworks.project.repository.RegistrationRepoInterface;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class RegistrationServiceImpli implements RegistrationServiceInterface{

    private static String UPLOADED_FOLDER = "C://Photos//";

    @Autowired
    RegistrationRepoInterface registrationRepoInterface;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public boolean saveRegistrationData(RegistrationDto registrationDto) {

        System.out.println(registrationDto);



        RegistrationDto dtoFindByEmaiId = fingByEmailId(registrationDto.getEmailId());
            System.out.println("dto fetched by email id  " + dtoFindByEmaiId);

            RegistrationDto dtoFindByMobileNo = fingByMobileNo(registrationDto.getContactNumber());
            System.out.println("dto fetched by mobile number  " + dtoFindByMobileNo);



            if (registrationDto.getPassword().equals(registrationDto.getConfirmPassword()) && dtoFindByEmaiId == null
                    && dtoFindByMobileNo == null) {
                String encode = bCryptPasswordEncoder.encode(registrationDto.getPassword());
                registrationDto.setPassword(encode);
                registrationDto.setFileName("dummy.jpg");
                registrationDto.setContentType("image/jpeg");
                RegistrationEntity entity = new RegistrationEntity();
                BeanUtils.copyProperties(registrationDto, entity);
                System.out.println("entity inside if" + entity);
                registrationRepoInterface.saveRegistrationData(entity);
                return true;
            } else {
                return false;
            }
    }

    @Override
    public RegistrationDto fingByEmailId(String emailId) {
        System.out.println(emailId);
        RegistrationEntity entity = registrationRepoInterface.findByEmailId(emailId);
       if(entity!=null) {
           RegistrationDto registrationDto = new RegistrationDto();
           BeanUtils.copyProperties(entity, registrationDto);
           System.out.println(registrationDto);
           return registrationDto;
       }
       return null;
    }

    @Override
    public RegistrationDto fingByMobileNo(long contactNumber) {
        System.out.println(contactNumber);
        RegistrationEntity entity = registrationRepoInterface.findByMobileNo(contactNumber);
        if(entity!=null) {
            RegistrationDto registrationDto = new RegistrationDto();
            BeanUtils.copyProperties(entity, registrationDto);
            return registrationDto;
        }
        return null;
    }

    @Override
    public boolean login(String emailId, String password) {

        RegistrationEntity dtoFinfByEmail = registrationRepoInterface.findByEmailId(emailId);

        if(dtoFinfByEmail!=null) {
          if(dtoFinfByEmail.getNoOfAttempts()<4) {
              if (bCryptPasswordEncoder.matches(password, dtoFinfByEmail.getPassword())) {
                  RegistrationEntity entity1 = new RegistrationEntity();
                  BeanUtils.copyProperties(dtoFinfByEmail, entity1);
                  entity1.setNoOfAttempts(0);
                  entity1.setEnabled(true);
                  registrationRepoInterface.loginUpdate(entity1);

                  LogInEntity loginFetchedDetails = registrationRepoInterface.findLoginDetails(emailId);
                  if(loginFetchedDetails != null)
                  {
                      LogInEntity entity= new LogInEntity();
                      loginFetchedDetails.setEmailId(emailId);
                      loginFetchedDetails.setLongInTime(LocalTime.now().toString());
                      loginFetchedDetails.setLogInDate(LocalDate.now().toString());
                      registrationRepoInterface.login(loginFetchedDetails);
                  }
                  else {
                      LogInEntity logInEntity = new LogInEntity();
                      System.out.println(LocalDate.now().toString());
                      System.out.println(LocalTime.now().toString());
                      logInEntity.setEmailId(emailId);
                      logInEntity.setLongInTime(LocalTime.now().toString());
                      logInEntity.setLogInDate(LocalDate.now().toString());
                      registrationRepoInterface.login(logInEntity);
                  }

                  return true;
              } else {
                  RegistrationEntity entity = new RegistrationEntity();
                  BeanUtils.copyProperties(dtoFinfByEmail, entity);
                  int attempt = entity.getNoOfAttempts();
                  attempt++;
                  entity.setNoOfAttempts(attempt);
                  if (attempt >= 3) {
                      entity.setEnabled(false);
                  }
                  registrationRepoInterface.loginUpdate(entity);
                  return false;
              }
          }
        }
        return false;
    }

    @Override
    public boolean saveOtp(String otp, String emailId) {
        System.out.println("in saveotp" + otp +"email====== " + emailId);
        RegistrationEntity dtoFindByEmail = registrationRepoInterface.findByEmailId(emailId);
        if(dtoFindByEmail != null)
        {
            RegistrationEntity entity= new RegistrationEntity();
            BeanUtils.copyProperties(dtoFindByEmail,entity);
            entity.setOtp(otp);
            registrationRepoInterface.saveOtp(entity);
            return true;
        }

        return false;
    }

    @Override
    public boolean verifyOtp(String emailId, String otp) {
        System.out.println("in service verify otp" + otp +"email====== " + emailId);
        RegistrationEntity dtoFindByEmail = registrationRepoInterface.findByEmailId(emailId);
        if(dtoFindByEmail != null)
        {
            if(dtoFindByEmail.getOtp().equals(otp))
            {
                return  true;
            }
            else
            {
                return  false;
            }
        }
        return false;
    }

    @Override
    public boolean resetPassword(String emailId, String password, String confirmPassword) {
        System.out.println(" in service reset password======email " +emailId +  "pass====" + password + "confirm pass=====" + confirmPassword);
        RegistrationEntity dtoFindByEmail = registrationRepoInterface.findByEmailId(emailId);
        if(dtoFindByEmail != null)
        {
           if(password.equals(confirmPassword) && password !=null && confirmPassword != null)
           {
               RegistrationEntity entity=new RegistrationEntity();
               BeanUtils.copyProperties(dtoFindByEmail,entity);
               String encode = bCryptPasswordEncoder.encode(password );
               entity.setPassword(encode);
               entity.setNoOfAttempts(0);
               entity.setEnabled(true);
               registrationRepoInterface.resetPassword(entity);
               return true;
           }
           return false;
        }
        return false;
    }

    @Override
    public RegistrationDto loginEnitity(String emailId) {
        LogInEntity entity = registrationRepoInterface.findLoginDetails(emailId);
        System.out.println("entity in service ===========" + entity);
        if(entity != null)
        {
            RegistrationDto dto=new RegistrationDto();
            BeanUtils.copyProperties(entity,dto);
            return dto;

        }
        return null;
    }

    @Override
    public void logout(String emailId) {

        LogInEntity dto = registrationRepoInterface.findLoginDetails(emailId);
        System.out.println("entity from service  login =============== " + dto);
        if(dto != null)
        {
            LogInEntity entity=new LogInEntity();
            BeanUtils.copyProperties(dto,entity);
            entity.setLogoutTime(LocalTime.now().toString());
            registrationRepoInterface.logout(entity);
        }

    }

    @Override
    public boolean saveUpdate(RegistrationDto registrationDto, MultipartFile file) {
        System.out.println(registrationDto);

            String encode = bCryptPasswordEncoder.encode(registrationDto.getPassword());
            registrationDto.setPassword(encode);

            if(file.isEmpty())
            {
                RegistrationEntity dtoFindByEmail = registrationRepoInterface.findByEmailId(registrationDto.getEmailId());
                registrationDto.setFirstName(registrationDto.getFileName());
                registrationDto.setContentType(registrationDto.getContentType());
            }
            else {
                try {

                    // Get the file and save it somewhere
                    byte[] bytes = file.getBytes();
                    Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
                    Files.write(path, bytes);
                    registrationDto.setContentType(file.getContentType());
                    System.out.println("file content type==== " + file.getContentType());
                    registrationDto.setFileName(file.getOriginalFilename());

                    System.out.println("file file name type==== " + file.getOriginalFilename());



                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        RegistrationEntity entity = new RegistrationEntity();
        BeanUtils.copyProperties(registrationDto, entity);
            System.out.println("enitity inside if" + entity);
            registrationRepoInterface.updateData(entity);
            return true;

    }


}
