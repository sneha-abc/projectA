package com.collection.arraylist.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Sports {
    public static void main(String[] args)
    {
        List<String> sport = new LinkedList<>();
        sport.add("cricket");
        sport.add("soccer");
        sport.add("basketball");
        sport.add("tennis");
        sport.add("volleyball");

        System.out.println(sport);

        for(String ref: sport)
        {
            System.out.println(ref);
        }

        System.out.println(sport.isEmpty());
        System.out.println(sport.size());
        System.out.println(sport.get(1));
        System.out.println(sport.indexOf("cricket"));
        System.out.println(sport.remove(3));
        System.out.println(sport.contains("golf"));
        sport.set(2,"football");
        sport.add("cricket");
        System.out.println("index of value is"+ sport.indexOf("cricket"));
        System.out.println(sport.lastIndexOf("cricket"));

        Iterator<String> iterator = sport.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("===================================================");

        ListIterator<String> list = sport.listIterator();
        while(list.hasNext()){
            System.out.println(list.next());
        }
        System.out.println("================================================");

        while(list.hasPrevious()){
            System.out.println(list.previous());
        }
    }

}
//functional interface-have only 1 abstract method in default
//marker
