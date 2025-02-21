package com.collection.arraylist.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ContactNumber {
    public static void main(String[] args)
    {
        List<Long> numbers=new LinkedList<>();
        System.out.println(numbers.isEmpty());
        numbers.add(9380483442l);
        numbers.add(4588755656l);
        numbers.add(5464684864l);
        numbers.add(4846484864l);
        numbers.add(4864844846l);

        System.out.println(numbers);

        for(Long ref:numbers)
        {
            System.out.println(ref);
        }

        System.out.println(numbers.isEmpty());
        System.out.println(numbers.size());
        System.out.println(numbers.get(2));
        System.out.println(numbers.indexOf(3));
        System.out.println(numbers.remove(4));
        System.out.println(numbers.contains(45544l));
        numbers.set(3,89798664864l);
        numbers.add(4588755656l);
        System.out.println("index of value is"+numbers.indexOf(4588755656l));
        System.out.println(numbers.lastIndexOf(4588755656l));

        Iterator<Long> iterator = numbers.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
