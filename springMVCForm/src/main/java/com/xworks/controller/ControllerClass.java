package com.xworks.controller;

import com.xworks.dto.StudentDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class ControllerClass {
    public ControllerClass() {
        System.out.println("it is a controller class");
    }

    @GetMapping("formdata")
    public String getRequest(StudentDTO dto,@RequestParam ("Gender") String gender,@RequestParam String dropdown)
    {
        System.out.println("this is request");
        System.out.println("studentName==============="+dto.getStudentName());
        System.out.println("parentName==============="+dto.getParentName());
        System.out.println("age==============="+dto.getAge());
        System.out.println("phone number==============="+dto.getContactNumber());
        System.out.println("email==============="+dto.getEmail());
        System.out.println("date of birth==============="+dto.getDateOfBirth());
        System.out.println("address==============="+dto.getAddress());
        return "next.jsp";
    }
}
