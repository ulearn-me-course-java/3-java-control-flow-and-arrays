package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int i = numMin(arr);
        int buf = arr[i];
        arr[i] = arr[0];
        arr[0] = buf;
    }

    static int numMin(int[] arr) {
        int minInd = 0;
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] <= minVal) {
                minInd = i;
                minVal = arr[i];
            }
        return minInd;
    }
}