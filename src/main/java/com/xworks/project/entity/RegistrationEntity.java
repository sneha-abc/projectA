package com.xworks.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="registration_information")
@NamedQuery(name ="findByEmail",query ="select r from  RegistrationEntity r where emailId=:emailId")

@NamedQuery(name ="findByPhoneNo",query ="select r from  RegistrationEntity r where contactNumber=:phoneNo ")
public class RegistrationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email_id")
    private  String emailId;
    @Column(name = "contact_number")
    private  long contactNumber;
    private  String city;
    private String gender;
    private String password;
    @Column(name="no_of_attempts")
    private int noOfAttempts=0;
    private boolean isEnabled=true;
    private String otp;
    @Column(name = "file_name")
    private String fileName;
    @Column(name="content_type")
    private String contentType;


}
