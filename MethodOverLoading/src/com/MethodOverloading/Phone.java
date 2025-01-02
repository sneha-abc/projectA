package com.MethodOverloading;

public class Phone {
    String brand;
    int price;
    String storage;

    public void Phoneinfo(String brand){
        this.brand=brand;
    }

    public void Phoneinfo(String brand , int price) {
        this.brand=brand;
        this.price = price;

    }

    public void Phoneinfo(String brand , int price , String storage){
        this.brand=brand;
        this.price = price;
        this.storage=storage;
    }

    public String getBrand(){
        return brand;
    }
    public int getPrice(){
        return price;
    }
    public  String getStorage(){
        return storage;
    }
    public void use(){
        System.out.println("ued to call and send message-parent class");
    }
    public static void main(String[] args){
        Phone ph = new Phone();

        ph.Phoneinfo("apple");
        System.out.println(ph.getBrand());

        ph.Phoneinfo("samsung",30000);
        System.out.println(ph.getBrand());
        System.out.println(ph.getPrice());

        ph.Phoneinfo("vivo",40000,"120GB");
        System.out.println(ph.getBrand());
        System.out.println(ph.getPrice());
        System.out.println(ph.getStorage());

    }
}

