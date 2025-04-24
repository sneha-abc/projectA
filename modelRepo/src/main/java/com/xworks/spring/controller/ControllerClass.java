package com.xworks.spring.controller;


import com.xworks.spring.dto.StudentDTO;
import com.xworks.spring.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class ControllerClass {
    @Autowired
    ServiceInterface serviceInterface;
    public ControllerClass() {
        System.out.println("it is a controller class");
    }

    @GetMapping("formdata")
    public String getRequest(StudentDTO dto, @RequestParam("Gender") String gender, @RequestParam String dropdown,Model model)
    {


        System.out.println("this is request");
        System.out.println("studentName==============="+dto.getStudentName());
        System.out.println("parentName==============="+dto.getParentName());
        System.out.println("age==============="+dto.getAge());
        System.out.println("phone number==============="+dto.getContactNumber());
        System.out.println("email==============="+dto.getEmail());
        System.out.println("date of birth==============="+dto.getDateOfBirth());
        System.out.println("address==============="+dto.getAddress());

        model.addAttribute("studentName",dto.getStudentName());
        model.addAttribute("parentName",dto.getParentName());
        model.addAttribute("age",dto.getAge());
        model.addAttribute("contactNumber",dto.getContactNumber());
        model.addAttribute("dateOfBirth",dto.getDateOfBirth());
        model.addAttribute("address",dto.getAddress());

        System.out.println("sending student dto to service"+dto);
        serviceInterface.saveData(dto);

        return "new.jsp";
    }
}
