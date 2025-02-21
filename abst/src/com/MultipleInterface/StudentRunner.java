package com.MultipleInterface;

public class StudentRunner {
    public static void main(String[] args){

        Trainee1 t1 =  new Student("java");
        t1.test();
        t1.assignement();

        Student s1 = (Student) t1;//presentation  is not present in trainee 1  so we do down casting
        s1.presentation();


        Trainee2 t2 = new Student("Html");
        t2.test();
        t2.presentation();

        Student s2 = (Student) t2;//assignement is not present in trainee 2 so we do down casting
        s2.assignement();
    }
}

