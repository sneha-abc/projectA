package com.xworks.spring.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
//@NoArgsConstructor
//@RequiredArgsConstructor
public class StudentDto {
    private Integer id;
    @NotNull(message = "StudentName should not be Null")
    @NotBlank(message = "StudentName should not be Blank")
    @NotEmpty(message = "StudentName should not be Empty")
    private String studentName;
    @NotNull(message = "parentName should not be Null")
    @NotBlank(message = "parentName should not be Blank")
    @NotEmpty(message = "parentName should not be Empty")
    private String parentName;
    @Size(min = 2)
    private String age;
    @Size(max = 10)
    private String phoneNumber;
    @NotNull(message = "email should not be Null")
    @NotBlank(message = "email should not be Blank")
    @NotEmpty(message = "email should not be Empty")
    private String email;
    @Size(message = "enter the date of birth")
    private String birthDate;
    @NotNull(message = "address should not be Null")
    @NotBlank(message = "address should not be Blank")
    @NotEmpty(message = "address should not be Empty")
    private String address;
}