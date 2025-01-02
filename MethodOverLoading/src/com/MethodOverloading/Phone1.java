package com.MethodOverloading;

public class Phone1 {
    public void use(){
        System.out.println("it is used to call and send message=child class");
    }
    public static void main(String[] args){
        Phone1 obj = new Phone1();
        obj.use();
    }
}
