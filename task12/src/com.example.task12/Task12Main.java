package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        for (int i = 0; i < arr.length; i++){
            swap(arr, i);
        }
    }

    static void swap(int[] arr, int startInd) {
        int i = numMin(arr, startInd);
        int buf = arr[i];
        arr[i] = arr[startInd];
        arr[startInd] = buf;
    }

    static int numMin(int[] arr, int startInd) {
        int minInd = 0;
        int minVal = Integer.MAX_VALUE;
        for (int i = startInd; i < arr.length; i++)
            if (arr[i] <= minVal) {
                minInd = i;
                minVal = arr[i];
            }
        return minInd;
    }

}