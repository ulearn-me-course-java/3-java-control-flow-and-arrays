package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
    }

    static void swap(int[] arr) {
        if (arr == null) return;
        if (arr.length == 0) return;
        int min = Integer.MAX_VALUE;
        int numMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                numMin = i;
            }
        }
        arr[numMin] = arr[0];
        arr[0] = min;
    }

}