package com.example.task12;

import java.util.Arrays;

public class Task12Main {
    public static void main(String[] args) {
    }

    static void selectionSort(int[] arr) {
        if (Arrays.equals(arr, null) || arr.length == 0) return;

        for (int i = 0, minIndex = i; i < arr.length - 1; i++, minIndex = i) {
            for (int j = i + 1, min = arr[i]; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            swapByIndex(arr, i, minIndex);
        }
    }

    private static void swapByIndex(int[] arr, int indexA, int indexB) {
        int t = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = t;
    }
}
