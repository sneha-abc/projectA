package com.xworks.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="log_in_details")
@NamedQuery(name ="findLoginDetails",query ="select r from  LogInEntity r where emailId=:emailId")
public class LogInEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="log_in_time")
    private String longInTime;
    @Column(name="email_id")
    private String emailId;

    @Column(name="log_in_date")
    private String logInDate;
    @Column(name="logout_time")
    private String logoutTime="000000";
}
