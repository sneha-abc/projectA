package com.Clone;
//deep cloning
//cloneable-marker interface
public class Book implements Cloneable{
    String bookName;
    String color;
    int noOfPages;

    //class dataType  classVariable
    Author author;//indirectly accessing properties of another class,has a relation

    public Book(String bookName,String color,int noOfPages,Author author)
    {
        this.bookName=bookName;
        this.color=color;
        this.noOfPages=noOfPages;
        this.author=author;
    }
//while cloning we will ge compile time exception so we mention the exception in class
    public static void main(String[] args) throws CloneNotSupportedException {
        Author author=new Author("arun","india");
        Book book=new Book("wings of fire","blue",250,author);
        //before cloning the values
        System.out.println(book.bookName);
        System.out.println(book.color);
        System.out.println(book.noOfPages);
        System.out.println(book.author.name);//to access the properties of another class we mention object.classvariable.property
        System.out.println(book.author.place);

        //cloning the object values
        //DownCasting
        Book book1= (Book) book.clone();

        //changing the values in Author
        book1.author.place="maxico";
        book1.author.name="tiwari";

        //after cloning and changing in clone object
        System.out.println(book1.bookName);
        System.out.println(book1.color);
        System.out.println(book1.noOfPages);
        System.out.println(book1.author.name);
        System.out.println(book1.author.place);
        //printing values original object values after changing in clone object
        System.out.println(book.author.name);
        System.out.println(book.author.place);
    }

    @Override
    //overrideing to avoid change in original object
    protected Object clone() throws CloneNotSupportedException {
        Author a= new Author(this.author.name,this.author.place);
        Book b=new Book(this.bookName,this.color,this.noOfPages,a);
        return b;
    }
}
