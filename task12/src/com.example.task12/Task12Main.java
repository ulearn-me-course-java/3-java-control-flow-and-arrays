package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int firstEl;
        int minEl;
        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            firstEl = arr[i];
            minEl = arr[i];
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (minEl > arr[j]) {
                    minEl = arr[j];
                    minIndex = j;
                }
            }
            arr[i] = minEl;
            arr[minIndex] = firstEl;
        }
    }

}