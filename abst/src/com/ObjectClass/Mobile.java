package com.ObjectClass;

public class Mobile {

    private int mobileId;
    private String name;

    public Mobile(int mobileId,String name){
        this.name=name;
        this.mobileId=mobileId;
    }
@Override
    public String toString()
    {
        return "mobile id is "+mobileId+ "mobile name is"+name;
    }
    @Override
    public int hashCode() {
        return mobileId;
    }

    public boolean equals(Object obj) {
        if(obj==null)//checking contents inside the object
        {
            return false;
        }
        if(obj instanceof Mobile)
        {
            Mobile  mobile= (Mobile) obj;//downcasting
            if(this.mobileId==mobile.mobileId && this.name.equals(mobile.name))
            {
                return true;
            }
        }
        return false;
    }

}
