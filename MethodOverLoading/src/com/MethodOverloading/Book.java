package com.MethodOverloading;

public class Book {
    String brand;
    String type;
    int price;
    public void BookInfo(String brand){
        this.brand=brand;
    }

    public void BookInfo(String brand , String type) {
        this.brand=brand;
        this.type = type;

    }

    public void BookInfo(String brand , String type , int price){
        this.brand=brand;
        this.type = type;
        this.price = price;

    }

    public String getBrand(){
        return brand;
    }
    public  String getType(){
        return type;
    }
    public int getPrice(){
        return price;
    }

    public void use(){
        System.out.println("books are used to read -parent class");
    }

    public static void main(String[] args){
        Book book = new Book();

        book.BookInfo("Classmate");
        System.out.println(book.getBrand());

        book.BookInfo("classmate","unruled");
        System.out.println(book.getBrand());
        System.out.println(book.getType());

        book.BookInfo("classmate","ruled",60);
        System.out.println(book.getBrand());
        System.out.println(book.getType());
        System.out.println(book.getPrice());


    }
}
