package com.example.task11;

import java.util.Arrays;

public class Task11Main {
    public static void main(String[] args) {

    }

    static void swap( int[] arr) {
        int index = 0;
        if ((arr != null) && (arr.length != 0)) {
            int[] copy = Arrays.copyOf(arr, arr.length);
            Arrays.sort(copy);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == copy[0]) {
                    index = i;
                }
            }
            int lowest = copy[0];
            int first = arr[0];
            arr[index] = first;
            arr[0] = lowest;
        }
    }
}