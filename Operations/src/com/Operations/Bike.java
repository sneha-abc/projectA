package com.Operations;

public class Bike {
    private double price;
    private String name;
    private String bikeNumber;
    private String buyerName;
    public Bike(double price,String name,String bikeNumber,String buyerName)
    {
        this.price=price;
        this.name=name;
        this.bikeNumber=bikeNumber;
        this.buyerName=buyerName;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public double getprice()
    {
        return price;
    }

    public String getName()
    {
        return name;
    }

    public String getBikeNumber()
    {
        return bikeNumber;
    }

    public String getBuyerName() {
        return buyerName;
    }

    @Override
    public String toString()
    {
        return "price-"+ price+ "name-" + name + "bikeNumber-" + bikeNumber+ "buyerName-" + buyerName;
    }
}
