package com.ObjectClass;

public class Flight {
    private String flightName;
    private String destination;
    private int price;

    public Flight( String flightName,String destination,int price){
        this.flightName=flightName;
        this.price=price;
        this.destination=destination;
    }

    @Override
    public String toString() {
        return " flight " + flightName + " taking off to " + destination + " which cost rupees " + price;
    }

    @Override
    public int hashCode() {
        int hash=5;

        hash = 10 *hash + this.flightName.hashCode();

        hash = 10*hash+this.destination.hashCode();

        hash = 10*hash+this.price;

        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return  false;
        }
        if(obj instanceof  Flight){

            Flight flight = (Flight) obj;
            if(this.flightName.equals(flight.flightName) && this.destination.equals(flight.destination) && this.price==
                    flight.price){
                return  true;
            }
        }
        return  false;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("calling finalize method");
        super.finalize();
    }
}
