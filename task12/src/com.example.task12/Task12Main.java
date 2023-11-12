package com.example.task12;

public class Task12Main {

    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
        //swap(arr, 0, 2);
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        for (int i = 0; i < arr.length; i++) {
            int minNmIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minNmIndex] > arr[j]) {
                    minNmIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minNmIndex];
            arr[minNmIndex] = temp;
        }
    }


    static void swap(int[] arr, int firstElemIndex, int secondElemIndex) {
        int temp = arr[firstElemIndex];
        arr[firstElemIndex] = arr[secondElemIndex];
        arr[secondElemIndex] = temp;
    }
}