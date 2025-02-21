package com.collection.arraylist.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Size {
    public static void main(String[] args)
    {
        List<Character> character= new LinkedList<>();
        System.out.println(character.isEmpty());
        character.add('s');
        character.add('m');
        character.add('l');
        character.add('x');


        System.out.println(character);

        for(Character ref:character)
        {
            System.out.println(ref);
        }

        System.out.println(character.isEmpty());
        System.out.println(character.size());
        System.out.println(character.get(1));
        System.out.println(character.indexOf('s'));
        System.out.println(character.remove(3));
        System.out.println(character.contains('r'));
        character.set(2,'s');
        character.add('m');
        System.out.println("index of value is"+character.indexOf('m'));
        System.out.println(character.lastIndexOf('m'));

        Iterator<Character> iterator = character.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
