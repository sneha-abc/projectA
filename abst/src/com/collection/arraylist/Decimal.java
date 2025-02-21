package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Decimal {


        public static void main(String[] args)
        {
            List<Float> d =new ArrayList<Float>();
            System.out.println(d.isEmpty());
            d.add(20.5f);
            d.add(10.5f);
            d.add(5.8f);
            d.add(45.2f);
            d.add(71.2f);

            System.out.println(d);

            for(Float ref: d)
            {
                System.out.println(ref);
            }

            System.out.println(d.isEmpty());
            System.out.println(d.size());
            System.out.println(d.get(1));
            System.out.println(d.indexOf(4055.5f));
            System.out.println(d.remove(1));
            System.out.println(d.contains(5.2f));
            d.set(3,6025.45f);
            d.add(4055.5f);
            System.out.println("index of value is"+ d.indexOf(4055.5f));
            System.out.println(d.lastIndexOf(4055.5f));

            Iterator<Float> iterator = d.iterator();

            while (iterator.hasNext())
            {
                System.out.println(iterator.next());
            }
        }
    }

//word
//car
//number
//grade
//decimal