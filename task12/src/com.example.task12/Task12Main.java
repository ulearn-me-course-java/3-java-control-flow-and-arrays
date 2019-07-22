package com.example.task12;

public class Task12Main {
    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            int index = 0;

            for (int j = i; j < arr.length; j++) {
                if (arr[j] <= min) {
                    min = arr[j];
                    index = j;
                }
            }

            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
        }
    }
}