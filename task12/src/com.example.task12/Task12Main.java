package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
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