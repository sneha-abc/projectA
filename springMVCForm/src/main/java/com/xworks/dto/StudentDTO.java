package com.xworks.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
//@NoArgsConstructor
//@RequiredArgsConstructor
public class StudentDTO {
    private String studentName;
    private String parentName;
    private String age;
    private String contactNumber;
    private String email;
    private String dateOfBirth;
    private String address;
}
