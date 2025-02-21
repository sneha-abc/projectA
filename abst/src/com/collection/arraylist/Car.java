package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Car {
    public static void main(String[] args) {
        List<String> car = new ArrayList<String>();
        System.out.println(car.isEmpty());
        car.add("bmw");
        car.add("volvo");
        car.add("audi");
        car.add("benze");
        car.add("lamborgini");

        System.out.println(car);

        for(String ref : car){
            System.out.println(ref);
        }

        System.out.println(car.isEmpty());
        System.out.println(car.size());
        System.out.println(car.get(3));

        System.out.println(car.indexOf("bmw"));

        System.out.println(car.remove("volvo"));

        System.out.println(car.contains("brezza"));

        car.set(1,"maruti");

        car.add("bmw");

        System.out.println(" index of valur is "+ car.indexOf("audi"));

        System.out.println(car.lastIndexOf("bmw"));

        Iterator<String> iterator = car.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}


