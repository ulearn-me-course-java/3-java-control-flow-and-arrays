package com.example.task11;

import java.util.Arrays;

public class Task11Main {
    public static void main(String[] args) {
    }

    static void swap(int[] arr) {
        if (Arrays.equals(arr, null) || arr.length == 0) return;
        int minIndex = getMinIndex(arr);
        swapWithMinIndex(arr, minIndex);
    }

    private static int getMinIndex(int[] arr) {
        int minIndex = 0;
        for (int i = 0, min = Integer.MAX_VALUE; i < arr.length; i++) {
            if (arr[i] <= min) {
                minIndex = i;
                min = arr[i];
            }
        }
        return minIndex;
    }

    private static void swapWithMinIndex(int[] arr, int minIndex) {
        int t = arr[0];
        arr[0] = arr[minIndex];
        arr[minIndex] = t;
    }
}
