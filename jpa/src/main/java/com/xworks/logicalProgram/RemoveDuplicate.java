package com.xworks.logicalProgram;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] array = {3,4,5,4,6,4,1,2,2,1,8,7,9,9,4};

        System.out.println("before removing duplicate values "+ Arrays.toString(array));

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0;i<array.length;i++)
        {
            hashSet.add(array[i]);
        }

        System.out.println("after removing duplicate values "+hashSet);
    }
}
