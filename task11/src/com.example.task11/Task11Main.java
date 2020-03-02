package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {

        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                int zeroValue = arr[0];
                arr[0] = arr[minIndex(arr)];
                arr[minIndex(arr)] = zeroValue;
            }
        }

    }

    static int minIndex(int[] arr) {
        int i;
        int num = 0;
        int min = arr[0];
        if (arr.length == 0)
            return 0;
        for (i = 0; i < arr.length; i++) {
            if (min >= arr[i]) {
                min = arr[i];
                num = i;
            }
        }
        return num;
    }

}