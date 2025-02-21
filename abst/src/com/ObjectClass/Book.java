package com.ObjectClass;

public class Book {

    private String title;
    private String author;
    private int price;

    public Book( String title,String author,int price){
        this.title=title;
        this.price=price;
        this.author=author;
    }

    @Override
    public String toString() {
        return "title of the book is " + title + "written by" + author + "and price is " + price;
    }

    @Override
    public int hashCode() {
        int hash=10;
        hash = 20*hash+this.title.hashCode();

        hash = 20*hash+this.author.hashCode();

        hash= 20*hash+this.price;

        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
        if(obj instanceof Book){
            Book book = (Book) obj;
            if(this.title.equals(book.title) &&this.author.equals(book.author) && this.price==book.price){
                return  true;
            }
        }
        return false;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("calling finalize method");
        super.finalize();
    }
}
