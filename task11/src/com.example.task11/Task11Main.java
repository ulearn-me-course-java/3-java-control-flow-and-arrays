package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {

        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {

        if (arr != null) {
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[0] > arr[i]) {
                    int a = arr[0];
                    arr[0] = arr[i];
                    arr[i] = a;
                }
            }
        }
    }
}