package org.example;

import java.util.Arrays;


import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args ) {
        int n = 5;
        Pair arr[] = new Pair[n];

        arr[0] = new Pair("abc", 3);
        arr[1] = new Pair("a", 4);
        arr[2] = new Pair("bc", 5);
        arr[3] = new Pair("a", 2);
        arr[4] = new Pair("abc", 7);

        // print before sorting
        System.out.println("Before sorting: ");
        print(arr);

        //sort array
        Arrays.sort(arr);

        //print after sorting
        System.out.println("After sorting: ");
        print(arr);
    }

    public static void print(Pair[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
