package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {

        int[] arr = {7, 5, 9, 3, 2, 5, 7, 1};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        int min_number = 0;
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[0] > arr[i]) {
                    min_number = arr[0];
                    arr[0] = arr[i];
                    arr[i] = min_number;
                }
            }
        }
    }

}