package com.Operations;

public class Store {
    private int id;//declaring variables
    private String storeType;
    private String place;
    private String owner;
    public Store(int id,String storeType,String place,String owner)//creating constructor
    {
        this.id=id;
        this.storeType=storeType;
        this.place=place;
        this.owner=owner;
    }
    public void setId(int id)//created setter bec we need this for updating the data,by using seters we can set more than one value
    {
        this.id=id;
    }

    public int getId()//used setters bec to get the data
    {
        return id;
    }

    public String getStoreType()
    {
        return storeType;
    }

    public String getPlace()
    {
        return place;
    }

    public String getOwner() {
        return owner;
    }
    //before over riding to string will give fully qualified path
    @Override
    public String toString()//we do over riding toget the output all at a time
    {
        return "id-"+id+"storeType-"+ storeType +" place-"+place+"owner-"+owner;
    }
}
