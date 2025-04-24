package com.xworks.spring.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student_info")
 public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "student_name")
    private String studentName;
    @Column(name = "parent_name")
    private String parentName;
    @Column(name = "age")
    private String age;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "birth_date")
    private String birthDate;
    @Column(name = "address")
    private String address;
}

