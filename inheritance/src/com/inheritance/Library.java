package com.inheritance;

public class Library extends Building{
    int numberOfBooks;

    public Library()
    {
        System.out.println("Non parametrized child  constructor");
    }
    public Library(String address ,int floors ,int numberOfBooks)
    {
        super(address,floors);
        this.numberOfBooks=numberOfBooks;
        System.out.println("Parametrized child  constructor");
    }

    public int getNumberOfBooks()
    {
        return  numberOfBooks;
    }

    public static void main(String[] args){
        Library lib = new Library();
        Library lib1 = new Library("abc",10,20);
        Building buil =new Building();
        Building buil1 = new Building("xyz",5);
        System.out.println(lib1.getAddress());
        System.out.println(lib1.getFloors());
        System.out.println(lib1.getNumberOfBooks());
        System.out.println(buil1.getAddress());
        System.out.println(buil1.getFloors());
        buil1.setType("square");
        System.out.println(buil1.getType());
    }



}
