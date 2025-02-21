package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Number {

    public static void main(String[] args)
    {
        List<Integer> numbers=new ArrayList<Integer>();
        System.out.println(numbers.isEmpty());
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);

        for(Integer ref:numbers)
        {
            System.out.println(ref);
        }

        System.out.println(numbers.isEmpty());
        System.out.println(numbers.size());
        System.out.println(numbers.get(3));
        System.out.println(numbers.indexOf(4));
        System.out.println(numbers.remove(2));
        System.out.println(numbers.contains(1));
        numbers.set(3,6);
        numbers.add(9);
        System.out.println("index of value is"+numbers.indexOf(1));
        System.out.println(numbers.lastIndexOf(1));

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
