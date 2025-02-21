package com.collection.arraylist.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Decimal {
    public static void main(String[] args)
    {
        List<Double> d =new LinkedList<>();
        System.out.println(d.isEmpty());
        d.add(20.54566446);
        d.add(10.5);
        d.add(5.8);
        d.add(45.2);
        d.add(71.2);

        System.out.println(d);

        for( Double ref: d)
        {
            System.out.println(ref);
        }

        System.out.println(d.isEmpty());
        System.out.println(d.size());
        System.out.println(d.get(1));
        System.out.println(d.indexOf(4055.5));
        System.out.println(d.remove(1));
        System.out.println(d.contains(5.2));
        d.set(3,6025.45);
        d.add(4055.5);
        System.out.println("index of value is"+ d.indexOf(4055.5));
        System.out.println(d.lastIndexOf(4055.5));

        Iterator< Double> iterator = d.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
