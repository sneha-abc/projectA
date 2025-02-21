package com.collection.arraylist;

import java.util.*;

//<>
public class cityRunner {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<Integer>();

        number.add(5);
        number.add(6);
        number.add(8);
        number.add(9);
        number.add(10);

        System.out.println(number);
        for(Integer ref : number){
            System.out.println(ref);
        }


int size= number.size();
        System.out.println(size);
        System.out.println(number.get(4));
        System.out.println(number.indexOf(5));
        System.out.println(number.remove(1));
        boolean contains = number.contains(0);
        System.out.println(contains);

        Iterator<Integer> iterator = number.iterator();//we can only use while loop bec we only know the starting point
        while(iterator.hasNext()){//hash next() is used to move to next index
            System.err.println(iterator.next());//err is used to print the statements in different colour,next() is used to move to next element
        }

        List<String> list = new LinkedList<>();
        list.add("vijay nagar");
        list.add("rajaji nagar");
        list.add("bangalore");
        list.add("attigupe");

        System.out.println(list);
        System.out.println(list.size());


    }
}
