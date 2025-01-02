package com.inheritance;

public class Dog extends Species{
    public void smell()
    {
        System.out.println("Dogs have high level of smell sence");
    }

    public static void main(String[] args){
        Dog dog  = new Dog();

        dog.setName("Golden retriver");
        System.out.println(dog.getName());

        dog.setHabitat("Natural Habitat");
        System.out.println(dog.getHabitat());

        dog.setLifespan(25);
        System.out.println(dog.getLifespan());

        dog.Endangered();
        dog.smell();
    }
}