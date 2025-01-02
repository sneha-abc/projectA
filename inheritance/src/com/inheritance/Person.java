package com.inheritance;

public class Person {
    String name;
    int age;
    String gender;

    public Person()
    {
        //default super() Statment
        System.out.println("Non parameterised constructor");
    }

    public Person(String name, int age) {
        this();
        System.out.println("Parameterised  constructor");
        this.name = name;
        this.age = age;
    }

    public void setGender(String gender){
        this.gender=gender;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender(){
        return gender;
    }
}
