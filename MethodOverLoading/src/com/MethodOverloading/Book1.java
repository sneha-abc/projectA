package com.MethodOverloading;

public class Book1  extends Book{
    public void use(){
        System.out.println("books are used to read and write-child class");
    }
    public static void main(String[] args){
        Book1 book1 = new Book1();
        book1.use();

    }
}
