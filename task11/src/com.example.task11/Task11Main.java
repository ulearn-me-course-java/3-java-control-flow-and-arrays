package com.example.task11;

public class Task11Main {
    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                index = i;
            }
        }
        int temp = arr[0];
        arr[0] = min;
        arr[index] = temp;
    }

}