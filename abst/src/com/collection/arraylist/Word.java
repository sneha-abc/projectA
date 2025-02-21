package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Word {

    public static void main(String[] args) {
        List<String>  word = new ArrayList<String>();
        System.out.println(word.isEmpty());
        word.add("hello");
        word.add("good morning");
        word.add("school");
        word.add("college");
        word.add("mobile");

        System.out.println(word);

        for(String ref : word){
            System.out.println(ref);
        }

        System.out.println(word.isEmpty());
        System.out.println(word.size());
        System.out.println(word.get(2));

        System.out.println(word.indexOf("hello"));

        System.out.println(word.remove("school"));

        System.out.println(word.contains("hi"));

        word.set(3,"laptop");

        word.add("hello");

        System.out.println(" index of valur is "+ word.indexOf("college"));

        System.out.println(word.lastIndexOf("hello"));

        Iterator<String> iterator = word.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
    }

