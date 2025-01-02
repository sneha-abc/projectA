package com.MethodOverloading;

public class Fan1 {
    public void rotate(){
        System.out.println("it rotates-child");
    }
    public static void main(String[] args){
        Fan1 fan1 = new Fan1();
        fan1.rotate();
    }
}
