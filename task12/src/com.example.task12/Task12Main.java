package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {

    }

    static void selectionSort(int[] arr) {
        if ((arr == null) || (arr.length < 2))
            return;

        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            int min_index = 0;

            for (int j = i; j < arr.length; j++)
                if (arr[j] <= min) {
                    min = arr[j];
                    min_index = j;
                }

            arr[min_index] = arr[i];
            arr[i] = min;
        }
    }

}