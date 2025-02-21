package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Grade {


        public static void main(String[] args)
        {
            List<Character> character= new ArrayList<Character>();
            System.out.println(character.isEmpty());
            character.add('a');
            character.add('b');
            character.add('c');
            character.add('d');
            character.add('e');

            System.out.println(character);

            for(Character ref:character)
            {
                System.out.println(ref);
            }

            System.out.println(character.isEmpty());
            System.out.println(character.size());
            System.out.println(character.get(2));
            System.out.println(character.indexOf('c'));
            System.out.println(character.remove(3));
            System.out.println(character.contains('a'));
            character.set(3,'g');
            character.add('a');
            System.out.println("index of value is"+character.indexOf('b'));
            System.out.println(character.lastIndexOf('a'));

            Iterator<Character> iterator = character.iterator();

            while (iterator.hasNext())
            {
                System.out.println(iterator.next());
            }
        }
    }


