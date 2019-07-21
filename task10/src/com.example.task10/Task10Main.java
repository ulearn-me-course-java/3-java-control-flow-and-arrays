package com.example.task10;

public class Task10Main {
    static int numMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}