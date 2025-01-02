package com.MethodOverloading;

public class Laptop1 extends Laptop{
    String processor;

    public Laptop1(String brand ,int ram, String processor){
        super(brand,ram);
        System.out.println("parameterized child constructor");
        this.processor=processor;

    }

        public String getProcessor(){
        return processor;
    }

    public void downloads(){
        System.out.println("laptop downloads apps from playstore");
    }
    public static void main (String[] args){
        Laptop1 la1 = new Laptop1("dell",160,"i5");
        System.out.println(la1.getRam());
        la1.downloads();

    }

}
