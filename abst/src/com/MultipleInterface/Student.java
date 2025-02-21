package com.MultipleInterface;

public class Student implements Trainee1,Trainee2{

    String subject;

    public Student(String subject){
        this.subject=subject;
    }


    @Override
    public void test() {
        System.out.println("writing test on " + subject);
    }

    @Override
    public void presentation() {
        System.out.println("giving presentation on " + subject);
    }

    @Override
    public void assignement() {
        System.out.println(("writing assignment on " + subject));
    }
}

