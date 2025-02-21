package com.collection.arraylist.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PrimeNumber {

    public static void main(String[] args)
    {
        List<Integer> primeNumber=new LinkedList<>();
        System.out.println(primeNumber.isEmpty());
        primeNumber.add(2);
        primeNumber.add(3);
        primeNumber.add(5);
        primeNumber.add(7);
        primeNumber.add(11);

        System.out.println(primeNumber);

        for(Integer ref:primeNumber)
        {
            System.out.println(ref);
        }

        System.out.println(primeNumber.isEmpty());
        System.out.println(primeNumber.size());
        System.out.println(primeNumber.get(1));
        System.out.println(primeNumber.indexOf(3));
        System.out.println(primeNumber.remove(4));
        System.out.println(primeNumber.contains(1));
        primeNumber.set(3,8);
        primeNumber.add(3);
        System.out.println("index of value is"+primeNumber.indexOf(2));
        System.out.println(primeNumber.lastIndexOf(3));

        Iterator<Integer> iterator = primeNumber.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
