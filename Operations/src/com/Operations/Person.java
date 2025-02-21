package com.Operations;
//dto-data transfer object
public class Person {
    private int id;//declaring variables
    private String name;
    private String place;
    private String email;
    public Person(int id,String name,String place,String email)//creating constructor
    {
        this.id=id;
        this.name=name;
        this.place=place;
        this.email=email;
    }
    public void setName(String name)//created setter bec we need this for updating the data,by using seters we can set more than one value
    {
        this.name=name;
    }

    public int getId()//used setters bec to get the data
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPlace() {
        return place;
    }
//before over riding to string will give fully qualified path
    @Override
    public String toString()//we do over riding toget the output all at a time
    {
        return "id-"+id+"name-"+ name +" email-"+email+"place-"+place;
    }
}
