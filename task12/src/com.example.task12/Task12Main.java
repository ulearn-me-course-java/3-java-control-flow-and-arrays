package com.example.task12;

import java.util.Arrays;

public class Task12Main {

    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if (Arrays.equals(arr, null) || Arrays.equals(arr, new int[]{}))
            return;
        for (int i = 0; i< arr.length; i++){
            swap(arr, i);
        }
    }

    private static void swap(int[] arr , int start) {
        int minIndex = getMinIndex(arr, start);
        int t = arr[start];
        arr[start] = arr[minIndex];
        arr[minIndex] = t;
    }

    private static int getMinIndex(int[] arr, int start) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = start; i < arr.length; i++)
            if (arr[i] <= min) {
                min = arr[i];
                minIndex = i;
            }
        return minIndex;
    }

}