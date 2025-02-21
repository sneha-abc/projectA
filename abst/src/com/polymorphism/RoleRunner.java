package com.polymorphism;

public class RoleRunner {

    public static void main(String[] args){

        Person runner1 =new Person() ;
        runner1.role();

        Person runner2=new Father();
        runner2.role();

        Person runner3 = new Employee();
        runner3.role();

    }

}
