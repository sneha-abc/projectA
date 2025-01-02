package com.ab;

public  class Lion extends Animal {

//should use abstract key word if we are not doing implementation

    public void sound() {
        System.out.println("Lion roars");//implementation block
    }
    public   void sleep(){
        System.out.println("animals sleeps");
    }


    public void eat() {
        System.out.println("animals eat");
    }
    public void habitat() {
        System.out.println("animals eat");
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        //Animal animal = new Animal() ;if we have abstract key word in class we cant create object.
    lion.sound();
    lion.eat();
    lion.habitat();
    lion.run();
    lion.sleep();
    }
}
