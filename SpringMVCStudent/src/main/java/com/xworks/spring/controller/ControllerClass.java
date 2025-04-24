package com.xworks.spring.controller;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaGrammar;
import com.xworks.spring.dto.StudentDto;
import com.xworks.spring.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")

public class ControllerClass {
    @Autowired
ServiceInterface serviceInterface;

    public ControllerClass(){
        System.out.println("this is controller class");
    }
    @GetMapping("formdata")
    public String getRegisterPageRequest(@Valid StudentDto dto, Model model, @RequestParam String check, @RequestParam String dropdown, BindingResult bindingResult) {

        System.out.println("this is request");
        System.out.println("this is calling controller or request class");
        System.out.println("studentName===============" + dto.getStudentName());
        System.out.println("parentName===============" + dto.getParentName());
        System.out.println("age===============" + dto.getAge());
        System.out.println("phone number===============" + dto.getPhoneNumber());
        System.out.println("email===============" + dto.getEmail());
        System.out.println("date of birth===============" + dto.getBirthDate());
        System.out.println("address===============" + dto.getAddress());
        System.out.println("check " + check);
        System.out.println("combination " + dropdown);
        System.out.println(dto);


        model.addAttribute("studentName", dto.getStudentName());
        model.addAttribute("parentName", dto.getParentName());
        model.addAttribute("age", dto.getAge());
        model.addAttribute("contactNumber", dto.getPhoneNumber());
        model.addAttribute("dateOfBirth", dto.getBirthDate());
        model.addAttribute("address", dto.getAddress());
        model.addAttribute("email", dto.getEmail());
        

        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.hasErrors());
            System.out.println("calling error");
            List<ObjectError> errorList = bindingResult.getAllErrors();
            String error = errorList.get(1).getDefaultMessage();
            System.out.println(error);

            model.addAttribute("error", error);
            return "error";
        } else {
            System.out.println("calling saved data");
            serviceInterface.addData(dto);
            return "next";
        }
    }
        @RequestMapping("page")
        public String getAllFetch(Model model){

            List<StudentDto> dto = serviceInterface.fetchData();
            System.out.println(dto);
            model.addAttribute("fetch",dto);
            return  "fetch";
        }

    @GetMapping("getProfilePage")
    public String getDataById(Model model,@RequestParam Integer id)
    {

        System.out.println(id);
        StudentDto dto = serviceInterface.findDataById(id);
        model.addAttribute("dto",dto);
        System.out.println(dto);
        return "profile";
    }

    @GetMapping("update")
    public String updataData(StudentDto dto)
    {
        serviceInterface.updateDta(dto);
        return "success";
    }

    @GetMapping("deleteData/{id}")
    public String deletaData(@PathVariable Integer id, Model model)
    {
        System.out.println(id);
        boolean delete = serviceInterface.deleteDataService(id);
        if(delete) {
            model.addAttribute("dto","deleted successfully");
            return "delete";
        }
        else{
            model.addAttribute("dto","not deleted");
            return "delete";
        }
    }

}
