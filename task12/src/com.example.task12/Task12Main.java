package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        for (int i = 0; i < arr.length; i++) {
            int minElem = Integer.MAX_VALUE;
            int minElemIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] <= minElem) {
                    minElem = arr[j];
                    minElemIndex = j;
                }
            }
            int firstElem = arr[i];
            arr[i] = arr[minElemIndex];
            arr[minElemIndex] = firstElem;
        }
    }
}