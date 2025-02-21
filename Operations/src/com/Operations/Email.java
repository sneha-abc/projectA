package com.Operations;
//CRUD
public class Email {
    static String[] email=new String[5];//declaring array
    public static void main(String[] args){

        Email email=new Email();//creating object
        System.out.println(email.save("sagar@gmail.com"));//saving sagar to index 0, gets saved
        System.out.println(email.fetchEmail("sagar@gmail.com"));//fetching sagar after saving to index 0,gets fetched

        System.out.println(email.fetchEmail("ram@gmail.com"));//fetching ram without saving to index 1,gets default value null
        System.out.println(email.save("ram@gmail.com"));//saving ram to index 1, gets saved
        System.out.println(email.fetchEmail("sagar@gmail.com"));//fetching sagar in index 0
        System.out.println(email.fetchEmail("ram@gmail.com"));//fetching ram in index 1

        System.out.println(email.updateEmail("sneha@gmail.com",0));//updating sagar to sneha in index 0
        System.out.println(email.fetchEmail("sneha@gmail.com"));//fetching updated value sneha in index 0

        System.out.println(email.save("sagar@gmail.com"));//saving sagar to index 2, gets saved
        System.out.println(email.fetchEmail("sagar@gmail.com"));//fetching sagar in index 2
        System.out.println(email.deleteEmail("sagar@gmail.com"));//deleting sagar in index 2
        System.out.println(email.fetchEmail("sagar@gmail.com"));//we do not get sagar in index 2 bec the value is deleted

        System.out.println(email.save("shwetha@gmail.com"));//saving shwetha to index 2, gets saved
        System.out.println(email.fetchEmail("shwetha@gmail.com"));//fetching shwetha in index 2

        System.out.println(email.save("suma@gmail.com"));//saving suma to index 3, gets saved
        System.out.println(email.fetchEmail("suma@gmail.com"));//fetching suma in index 3

        System.out.println(email.save("vidya@gmail.com"));//saving suma to index 4, gets saved
        System.out.println(email.fetchEmail("vidya@gmail.com"));//fetching suma in index 4

        System.out.println(email.save("shamita@gmail.com"));//we can not save this value bec the values we can store in the given array is 4
        System.out.println(email.fetchEmail("shamita@gmail.com"));//if the value is not saved we can not fetch the value also
    }
    public boolean save(String emails)
    {
        boolean isSaved=false;
        for(int i=0;i< email.length;i++)
        {
            if(email[i]==null)
            {
                email[i]=emails;
                isSaved=true;
                break;
            }
        }
        return isSaved;
    }
    public String fetchEmail(String emails)
    {
        for(int i=0;i< email.length;i++)
        {
            if(email[i]==emails)
            {
                return email[i];
            }
        }
        return null;
    }
    public boolean updateEmail(String emails,int i)
    {
        if(i<email.length)
        {
            email[i]=emails;
            return true;
        }
        return false;
    }
    public boolean deleteEmail(String emails)
    {
        boolean isDeleted=false;
        for(int i=0;i< email.length;i++)
        {
            if(email[i]==emails)
            {
                email[i]=null;
                isDeleted=true;
                break;
            }
        }
        return isDeleted;
    }
}
