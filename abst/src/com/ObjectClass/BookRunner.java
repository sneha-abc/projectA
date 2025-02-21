package com.ObjectClass;

import java.lang.reflect.Method;

public class BookRunner {

    public static void main(String[] args) {

        Book book = new Book("theory of everything", "stephan", 100);
        System.out.println(book.toString());
        System.out.println(book.hashCode());


        Book book1 = new Book("wings of fire", "kalam", 200);
        System.out.println(book1.toString());
        System.out.println(book1.hashCode());

        Book book2 = new Book("theory of everything", "stephan", 100);
        System.out.println(book2.toString());
        System.out.println(book2.hashCode());

        System.out.println(book == book2);
        System.out.println(book.equals(book2));

        classMembers(book);

        book = null;

        System.gc();

    }
        public static void classMembers (Object obj){

            Class classObject = obj.getClass();

            System.out.println(classObject.getName());

            Method[] methods = classObject.getMethods();

            System.out.println(methods.length);

            for (int i = 0; i < methods.length; i++) {
                System.out.println(methods[i]);
            }
        }
    }

