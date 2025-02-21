package com.ObjectClass;

public class Metro {
    private int routeNumber;
    private String routeLine;

    public  Metro(int routeNumber,String routeLine){
        this.routeLine=routeLine;
        this.routeNumber=routeNumber;
    }

    @Override
    public String toString() {
        return "metro number "  + routeNumber + "travels in route line" + routeLine;
    }

    @Override
    public int hashCode() {
        return routeNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
        if(obj instanceof Metro){//checking that metro object is present in super class object
            Metro metro = (Metro) obj;//down casting
            {
                if(this.routeNumber==metro.routeNumber && this.routeLine.equals(metro.routeLine)){
                    return true;
                }
            }

        }
        return false;
    }
}
