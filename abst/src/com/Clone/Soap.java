package com.Clone;
//shallow cloning
public class Soap implements Cloneable{
    String brand;
    String name;
    int price;

    public Soap(String brand, String name, int price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Soap soap=new Soap("unilever","Dove",90);
        //before cloning
        System.out.println(soap.brand);
        System.out.println(soap.name);
        System.out.println(soap.price);

        //we get compile time exception  so we mention the throw in main method
        Soap soap1= (Soap) soap.clone();
        soap1.price=100;

        System.out.println(" Original values "+ soap.price);//original object values
        System.out.println(" after shallow cloning " + soap1.price);//copy object values after shallow cloning


    }
}
