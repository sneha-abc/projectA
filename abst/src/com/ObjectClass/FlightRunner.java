package com.ObjectClass;

import java.lang.reflect.Method;

public class FlightRunner {
    public static void main(String[] args) {

      Flight flight=new Flight("Indigo","amarica",20000);
        System.out.println(flight.toString());
        System.out.println(flight.hashCode());


        Flight flight1 = new Flight("Air India", "japan", 30000);
        System.out.println(flight1.toString());
        System.out.println(flight1.hashCode());


        Flight flight2=new Flight("Indigo","amarica",20000);
        System.out.println(flight2.toString());
        System.out.println(flight2.hashCode());

        System.out.println(flight == flight2);
        System.out.println(flight.equals(flight2));

        classMembers(flight);

        flight = null;

        System.gc();

    }
    public static void classMembers (Object obj){

        Class classObject = obj.getClass();

        System.out.println(classObject.getName());

        Method[] methods = classObject.getMethods();

        System.out.println(methods.length);

        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }
    }
}
