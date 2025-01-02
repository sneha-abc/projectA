package com.inheritance;

public class GrandParent {
    int age;
    String name;

    public GrandParent(){
        System.out.println("non parameterized GrandParent class constructor");
    }

    public GrandParent(int age , String name){
        System.out.println("parameterized GrandParent class constructor");
        this.age=age;
        this.name=name;
    }

    public  void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age ;
    }

    public String getName (){
        return name;
    }


    void familyHome(){
        System.out.println("They live in Bangalore");
    }
}
