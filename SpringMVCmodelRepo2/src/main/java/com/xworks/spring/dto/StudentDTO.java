package com.xworks.spring.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
//@NoArgsConstructor
//@RequiredArgsConstructor
public class StudentDTO {
    private Integer id;
    @NotNull
    @NotBlank
    @NotBlank
    private String studentName;
    @NotNull
    @NotBlank
    @NotBlank
    private String parentName;
    @Size(min=10)
    private String age;
    @Size(max = 10)
    private String contactNumber;
    @NotNull
    @NotBlank
    @NotBlank
    private String email;
    @Size(min=1-12-1999)
    private String dateOfBirth;
    @NotNull
    @NotBlank
    @NotBlank
    private String address;
}
