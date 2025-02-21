package com.polymorphism;

public class AnimalRunner {

    public static void main(String[] args){
        Animal animal=new Animal();
        animal.type();
        animal.specialCharacter();

        Animal animal1=new Lion();
        animal1.type();
        animal1.specialCharacter();

        Animal animal2=new Dog();
        animal2.type();
        animal2.specialCharacter();
    }
}
