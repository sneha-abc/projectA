package com.collection.arraylist;

import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args){
        ArrayList arrayList=new ArrayList();
        System.out.println(" the given array is empty " + arrayList.isEmpty());//to check the array is empty or no
        System.out.println(arrayList);//to get the length of the array
        arrayList.add("java");//adding an element to the array list
        System.out.println("the given array is empty " + arrayList.isEmpty());//now checking the array is empty or not
        System.out.println(arrayList);//checking the array length after adding an element
        arrayList.add("html");
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("spring");
        arrayList.add("python");

        System.out.println(arrayList);//fetching the length of the array list

        System.out.println("valur of the array index 3 is " + arrayList.get(3));//fetching the value present in the index 3

        arrayList.add(5,"angular");//adding the element in the index 5 and all the elements shift by next index
        System.out.println(arrayList);//fetching the length

        System.out.println("this array contains value " +arrayList.contains("java"));//checks the passed element is present array list

        arrayList.set(1,"core java");//replace the old element to new element in same index length of the array remains same
        System.out.println(arrayList);

        System.out.println("index of value is " + arrayList.indexOf("sql"));//fetching the index based on element

        System.out.println("the given array is empty " + arrayList.isEmpty());

        arrayList.add(3,"spring");
        System.out.println(arrayList);

        System.out.println("index of value is " + arrayList.indexOf("spring"));
        System.out.println(arrayList.lastIndexOf("spring"));

        System.out.println(arrayList.remove(4));

        System.out.println("the size of an array is "+arrayList.size());

        ArrayList list=new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        arrayList.retainAll(list);//to retain the certain values
        System.out.println(list);

        System.out.println(arrayList);

        list.clear();

        System.out.println(list);











    }
}


