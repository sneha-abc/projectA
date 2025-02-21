package dto;

import java.util.LinkedList;
import java.util.List;

public class AccountRunner {
    public static void main(String[] args) {
        List<AccountInfo> name = new LinkedList<>();
        System.out.println("is the name array empty   " + name.isEmpty());
        System.out.println("the size of the name array is  " + name.size());

        AccountInfo a1 = new AccountInfo("sneha", "sneha@gmail.com",9380483442l,"rtyu" ,"2002-03-25","female",22);


        AccountInfo a2 = new AccountInfo();
        a2.setUserName("sagar");
        a2.setEmailMail("sagar@gmail.com");
        a2.setPhoneNumber(9380103110l);
        a2.setPsw("dfgh");
        a2.setAge(19);
        a2.setDob("2005-05-28");
        a2.setGender("male");

        name.add(a1);
        name.add(a2);
        System.out.println(name);


        AccountInfo a3 = new AccountInfo("sujay","sujay@gmail.com",93801458456l,"njio","1997-02-13","male",28);

        AccountInfo a4 = new AccountInfo("rohit", "rohit@gamil.com",9864247895456l,"ertt","2002-03-23","male",24);


        List<AccountInfo> name1 = new LinkedList<>();
        name1.add(a3);
        name1.add(a4);
        System.out.println(name1);

        System.out.println("name array is empty : " + name.isEmpty());
        System.out.println("name1 array is empty : " + name1.isEmpty());
        System.out.println("name of get element of index 2 " +  name.get(0));
        System.out.println("name1 of get element of index 2 " + name1.get(1));
        System.out.println("size of name array :  "  + name.size());
        System.out.println("size of name1 array :  " + name1.size());
        System.out.println("name array contains a4 : " + name.contains(a4));
        System.out.println("index of name array is : " + name.indexOf(a2));
        System.out.println("iterator of name array is : "  + name.iterator());
        System.out.println("iterator of name1 array is : " + name1.iterator());




    }
}
