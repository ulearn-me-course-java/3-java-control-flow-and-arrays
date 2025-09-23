package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {

        int[] arr = {7, 5, 9, 1};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
            int minIndex = 0;
            for (int i = 1; i < arr.length; i++) if (arr[i] < arr[minIndex]) minIndex = i;
            int first = arr[0];
            arr[0] = arr[minIndex];
            arr[minIndex] = first;

    }

}