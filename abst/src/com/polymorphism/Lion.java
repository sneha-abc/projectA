package com.polymorphism;

public class Lion extends Animal{

    @Override
    public void type() {
        System.out.println("they are wild animals");
    }

    @Override
    public void specialCharacter() {
        System.out.println("they are good in hunting");
    }
}
