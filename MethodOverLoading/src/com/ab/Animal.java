package com.ab;

public abstract class Animal {
     // cant be private,protected, ,final
    //can be public and default



//checking variable can be declared as abstract
    //public abstract int legs; variable cant be abstract
       String name;


       //checking methods can be abstract
    //private abstract void attack();//cant be private
    abstract void sleep();//can be default
    protected abstract void habitat();//can be protected
    public abstract void eat();//can be public
    //public static abstract void habitat();
   // public final abstract void talk();cant be final


    protected  void run(){
        System.out.println("animals run");
    }

    public abstract void sound();

}

