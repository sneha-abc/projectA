package com.Operations;

public class Book {
    private int price;//declaring variables
    private String name;
    private String type;
    private int numberOfPages;
    public Book(int price,String name,String type,int numberOfPages)//creating constructor
    {
         this.price=price;
         this.name=name;
         this.type=type;
         this.numberOfPages=numberOfPages;
    }
    public void setName(String name)//created setter bec we need this for updating the data,by using seters we can set more than one value
    {
        this.name=name;
    }

    public int getPrice()//used getter bec to get the data
    {
        return price;
    }

    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
    //before over riding to string will give fully qualified path
    @Override
    public String toString()//we do over riding toget the output all at a time
    {
        return "price-"+price+"name-"+ name +" type-"+type+"numberOfPages-"+numberOfPages;
    }
}
