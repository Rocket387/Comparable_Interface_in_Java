package org.example;

import java.util.Arrays;

public class NameCompare {
    public static void main(String[] args) {

        int n = 4;
        Pair2 arr[] = new Pair2[n];
        arr[0] = new Pair2("Simon", "Jones");
        arr[1] = new Pair2("Steven", "Jones");
        arr[2] = new Pair2("Sandra", "Roberts");
        arr[3] = new Pair2("Sarah", "Jeffers");

        System.out.println("Before sorting: " );
        print(arr);
        Arrays.sort(arr);

        System.out.println("\n" );
        System.out.println("After sorting: " );
        print(arr);
    }

    public static void print(Pair2[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
