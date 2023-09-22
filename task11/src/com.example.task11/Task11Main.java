package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int minElem = Integer.MAX_VALUE;
        int minElemIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= minElem) {
                minElem = arr[i];
                minElemIndex = i;
            }
        }
        int firstElem = arr[0];
        arr[0] = arr[minElemIndex];
        arr[minElemIndex] = firstElem;
    }
}