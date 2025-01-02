package com.inheritance;

public class Parent  extends GrandParent{
    String profession;
    int salary;

    public Parent(){
        System.out.println("non parameterized parent class constructor");
    }

    public Parent(String profession , int salary){
        System.out.println("parameterized Parent class constructor");
        this.profession=profession;
        this.salary=salary;
    }

    public String getProfession(){
        return profession;
    }

    public int getSalary(){
        return salary;
    }

    void surName(){
        System.out.println("shidenur");
    }

}

