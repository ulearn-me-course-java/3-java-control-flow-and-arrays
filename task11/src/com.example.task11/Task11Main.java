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
        int minArr = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= minArr) {
                minArr = arr[i];
                minIndex = i;
            }
        }
        int interim = arr[0];
        arr[0] = minArr;
        arr[minIndex] = interim;
    }

}