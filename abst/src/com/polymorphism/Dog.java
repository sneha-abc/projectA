package com.polymorphism;

public class Dog extends Animal{

    @Override
    public void type() {
        System.out.println("they are pet animals");
    }

    @Override
    public void specialCharacter() {
        System.out.println("they have good smell sense");
    }
}
