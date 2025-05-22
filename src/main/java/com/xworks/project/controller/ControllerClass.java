package com.xworks.project.controller;

import com.xworks.project.dto.RegistrationDto;
import com.xworks.project.service.RegistrationServiceInterface;
import com.xworks.project.service.RegistrationServiceInterface;
import com.xworks.project.util.EmailSender;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.*;
import java.util.List;

@Controller
@RequestMapping("/")
public class ControllerClass {


    private static String UPLOADED_FOLDER = "C://Photos//";


    @Autowired
    RegistrationServiceInterface registratiopnServiceInterface;

    @Autowired
    EmailSender emailSender;

    @RequestMapping("register")
    public  String callRegisterPage(){
        System.out.println("calling register page");
        return "registration";
    }

    @PostMapping("formdata")
    public String register(@Valid RegistrationDto registrationDto, Model model, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            System.out.println(bindingResult.hasErrors());
            List<ObjectError> errorList = bindingResult.getAllErrors();
            String error =errorList.get(1).getDefaultMessage();
            System.out.println(error);
            model.addAttribute("error","enter valid data");

            return "registration";
        }

//        BCryptPasswordEncoder.encode(registrationDto.getPassword());

        //bCryptPasswordEncoder.matches()
        boolean result = registratiopnServiceInterface.saveRegistrationData(registrationDto);
        if(result)
        {
            model.addAttribute("message","registered successfully!!!!!!!!!!!!");

            return "registration";
        }
        else
        {
            model.addAttribute("error","enter valid data!!!!!!!!!");
            return "registration";
        }
    }
@RequestMapping("login")
    public String callLogin(){
    System.out.println("calling login page");
        return "login";

    }
    @RequestMapping("forgot")
    public String callForgotPasswordPage(){
        return "forgotpassword";
    }
    @RequestMapping("index")
    public String callHomePage(){
        System.out.println("calling home page");
        return "index";
    }
    @RequestMapping("loginform")
    public String login(@RequestParam String emailId,@RequestParam String password,Model model){

        RegistrationDto dtoDetails = registratiopnServiceInterface.fingByEmailId(emailId);
        System.out.println("calling login service"+emailId + "and" + password);
        boolean result = registratiopnServiceInterface.login(emailId, password);

         if(result)
         {
             model.addAttribute("message","login successfully");
             model.addAttribute("name",dtoDetails.getFirstName() );
             model.addAttribute("email",dtoDetails.getEmailId());
             model.addAttribute("file",dtoDetails.getFileName());
             return "profile";
         }
         else
        {
            if(dtoDetails.isEnabled()){
                model.addAttribute("message","");
            }
            else{
                System.out.println("in else=====================");
                model.addAttribute("message","account is blocked");
                model.addAttribute("dto",dtoDetails.getEmailId());
                return "forgotpassword";
            }
            model.addAttribute("message","invalid email and password");
            model.addAttribute("dto",dtoDetails.getEmailId());
            return "login";
        }
    }

    @RequestMapping("emailExist")
    @ResponseBody
    public ResponseEntity<String> emailExists(@RequestParam String emailId)
    {
        RegistrationDto emailExists = registratiopnServiceInterface.fingByEmailId(emailId);
        if(emailExists != null)
        {
           return ResponseEntity.ok("email is exist");
        }
            return  ResponseEntity.ok("email accepted");

    }
@RequestMapping("phoneNoExists")
@ResponseBody
    public  ResponseEntity<String> contactNoExists(@RequestParam long contactNumber)
    {
        RegistrationDto contactNoExists = registratiopnServiceInterface.fingByMobileNo(contactNumber);
        if(contactNoExists != null)
        {
            return  ResponseEntity.ok("contact number already exists");
        }
        return ResponseEntity.ok("contact accepted");
    }
    @PostMapping("sendOtp")
    public String getOtp(@RequestParam String emailId, Model model){
        RegistrationDto dtoFindByEmail = registratiopnServiceInterface.fingByEmailId(emailId);
        model.addAttribute("dto",dtoFindByEmail.getEmailId());
        String otp = emailSender.sendSimpleMessage(emailId);
        System.out.println(otp);
        boolean result = registratiopnServiceInterface.saveOtp(otp, emailId);
        if(result)
        {
            model.addAttribute("otpmsg","otp sent successfully");
        }
        else
        {
            model.addAttribute("otpmsg","otp not sent");
        }
        return "forgotpassword";
    }
    @PostMapping("verificationOTP")
    public  String verifyOtp(@RequestParam String emailId,@RequestParam  String otp,Model model){
        System.out.println("otp in controller " + otp + "email=====" + emailId);
        RegistrationDto dtoFindByEmail = registratiopnServiceInterface.fingByEmailId(emailId);
        boolean result = registratiopnServiceInterface.verifyOtp(emailId, otp);
        if(result)
        {
            model.addAttribute("verifymsg","otp verified");
            model.addAttribute("dto",dtoFindByEmail.getEmailId());
            return "resetpassword";
        }
        else
        {
            model.addAttribute("verifymsg","otp not verified");
            model.addAttribute("dto",dtoFindByEmail.getEmailId());
            return  "forgotpassword";
        }
     }
     @RequestMapping("resetform")
     public String resetPassword(@RequestParam String emailId,@RequestParam String password,@RequestParam String confirmPassword,Model model)
     {
         RegistrationDto dtoFindByEmail = registratiopnServiceInterface.fingByEmailId(emailId);
         System.out.println("email in resetpassword in controller  ==============" + emailId + "pass===== " + password + "confirm pass===="+confirmPassword);
         boolean result = registratiopnServiceInterface.resetPassword(emailId, password, confirmPassword);
         if(result )
         {
             model.addAttribute("error","password reset sucessfully");
             model.addAttribute("dto",dtoFindByEmail.getEmailId());
             return  "login";
         }
        else
         {
             model.addAttribute("error","password is not reset");
             model.addAttribute("dto",dtoFindByEmail.getEmailId());
             return  "forgotpassword";
         }
     }

     @RequestMapping("logout")
     public String logout(@RequestParam String emailId,Model model){
         System.out.println("in  controller logout===============emailid===== " + emailId);
         registratiopnServiceInterface.logout(emailId);
        return "login";
     }

     @RequestMapping("profile")
     public String profilePage(@RequestParam String emailId,Model model) {
         System.out.println("profilepage in controller ========email============ " + emailId);
         RegistrationDto userdetails = registratiopnServiceInterface.fingByEmailId(emailId);
         if (userdetails != null) {
             model.addAttribute("detail", userdetails);
             return "userProfile";
         } else {
             return "profile";
         }
     }
     @PostMapping("update")
     public String updateDeatails(@RequestParam("file") MultipartFile file, RegistrationDto dto, Model model){
         System.out.println("update dto in controller ===dto " + dto);
         System.err.println("====================="+file.getOriginalFilename()+"========="+file.getContentType());
         boolean result = registratiopnServiceInterface.saveUpdate(dto, file);
         RegistrationDto dtoDetails = registratiopnServiceInterface.fingByEmailId(dto.getEmailId());
         if(result)
         {
             model.addAttribute("msg","profile updated successfully");
             model.addAttribute("name",dtoDetails.getFirstName() );
             model.addAttribute("email",dtoDetails.getEmailId());
             model.addAttribute("file",dtoDetails.getFileName());
             return "profile";
         }
         else {
             model.addAttribute("error","profile not updated");
             model.addAttribute("name",dtoDetails.getFirstName() );
             model.addAttribute("email",dtoDetails.getEmailId());
             model.addAttribute("file",dtoDetails.getFileName());
             return "profile";
         }
     }

@GetMapping("image")
     public void getImage(@RequestParam String fileName, HttpServletResponse httpServletResponse){

         File file=new File(UPLOADED_FOLDER+fileName);//to get file from folder
         try {
             FileInputStream fileInputStream = new FileInputStream(file);//to read file from folder in the form of bytecode
             InputStream inputStream=new BufferedInputStream(fileInputStream);//to speed reading
             ServletOutputStream servletInputStream = httpServletResponse.getOutputStream();//to write the file to server response
             IOUtils.copy(inputStream,servletInputStream);//to copy file from input to output
             httpServletResponse.flushBuffer();//to display to the user
         }catch (IOException e){

         }

     }
     @RequestMapping("back")
     public  String back(@RequestParam String emailId ,Model model){
         RegistrationDto dtoDetails = registratiopnServiceInterface.fingByEmailId(emailId);
         model.addAttribute("name",dtoDetails.getFirstName() );
         model.addAttribute("email",dtoDetails.getEmailId());
         model.addAttribute("file",dtoDetails.getFileName());
         return "profile";
     }
}
