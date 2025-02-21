package dto;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class AccountInfo {
    private String userName;
    private String emailMail;
    private long phoneNumber;
    private String psw;
    private String dob;
    private String gender;
    private int age;
}
   //arraylist allow duplicate and null values