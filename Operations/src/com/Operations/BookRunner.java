package com.Operations;

public class BookRunner {
    Book[] books = new Book[10];
    public static void main(String[] args)
    {
        BookRunner runner=new BookRunner();

        System.out.println("object 1");
        Book book1=new Book(20,"classmate","rulled",200);
        System.out.println(runner.saveDetails(book1));
        Book b1=runner.fetchDetailsByName("classmate");
        System.out.println(b1.toString());

        System.out.println(runner.updateNameByType("rulled","navneet"));
        System.out.println(b1.getPrice());
        System.out.println(b1.getName());
        System.out.println(b1.getType());
        System.out.println(b1.getNumberOfPages());

        System.out.println("object 2");
        Book book2=new Book(30,"classmate","rulled",250);
        System.out.println(runner.saveDetails(book2));
        Book b2=runner.fetchDetailsByName("classmate");
        System.out.println(b2.toString());

        System.out.println("object 3");
        Book book3=new Book(35,"luxor","rulled",100);
        System.out.println(runner.saveDetails(book3));
        Book b3=runner.fetchDetailsByName("luxor");
        System.out.println(b3.toString());

        System.out.println("object 4");
        Book book4=new Book(40,"xyz","unrulled",150);
        System.out.println(runner.saveDetails(book4));
        Book b4=runner.fetchDetailsByName("xyz");
        System.out.println(b4.toString());

        System.out.println("object 5");
        Book book5=new Book(40,"paperkraft","rulled",300);
        System.out.println(runner.saveDetails(book5));
        Book b5=runner.fetchDetailsByName("paperkraft");
        System.out.println(b5.toString());

        System.out.println("object 6");
        Book book6=new Book(50,"happy","rulled",300);
        System.out.println(runner.saveDetails(book6));
        Book b6=runner.fetchDetailsByName("happy");
        System.out.println(b6.toString());


        System.out.println("object 7");
        Book book7=new Book(60,"artangle","unrulled",350);
        System.out.println(runner.saveDetails(book7));
        Book b7=runner.fetchDetailsByName("artangle");
        System.out.println(b7.toString());

        System.out.println("object 8");
        Book book8=new Book(65,"abc","rulled",200);
        System.out.println(runner.saveDetails(book8));
        Book b8=runner.fetchDetailsByName("abc");
        System.out.println(b8.toString());

        System.out.println("object 9");
        Book book9=new Book(30,"lmn","unrulled",250);
        System.out.println(runner.saveDetails(book9));
        Book b9=runner.fetchDetailsByName("lmn");
        System.out.println(b9.toString());


        System.out.println("object 10");
        Book book10=new Book(20,"def","rulled",300);
        System.out.println(runner.saveDetails(book10));
        Book b10=runner.fetchDetailsByName("def");
        System.out.println(b10.toString());





    }
    public boolean saveDetails(Book book)
    {
        boolean isSaved=false;
        for(int i=0;i< books.length;i++)
        {
            if(books[i]==null)
            {
                books[i]=book;
                isSaved=true;
                break;
            }
        }
        return isSaved;
    }
    public Book fetchDetailsByName(String name)
    {
        for(int i=0;i<books.length;i++)
        {
            if(books[i].getName()==name)
            {
                return books[i];
            }
        }
        return null;
    }
    public boolean updateNameByType(String type,String name)
    {
        for(int i=0;i< books.length;i++)
        {
            if(books[i].getType()==type)
            {
                books[i].setName(name);
                return true;
            }
        }
        return false;
    }
    public boolean deleteDetails(String name)
    {
        for(int i=0;i< books.length;i++)
        {
            if(books[i].getName()==name)
            {
                books[i] = null;
                return true;
            }
        }
        return false;
    }

}
