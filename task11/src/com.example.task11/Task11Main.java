package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {

    }

    static void swap(int[] arr) {
        if (arr != null && arr.length > 0) {
            int indexMin = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++)
                if (arr[i] <= min) {
                    indexMin = i;
                    min = arr[i];
                }
            arr[indexMin] = arr[0];
            arr[0] = min;

        }

    }
}