package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int min = arr[0];
        int numbermin = 0;
        for (int i = 0; i < arr.length-1; i++)
            if (arr[i+1] < min) {
                min = arr[i+1];
                numbermin = i+1;
            }
        arr[numbermin] = arr[0];
        arr[0] = min;
    }

}