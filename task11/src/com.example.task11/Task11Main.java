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
        int indexOfMin = 0;
        int min = arr[0];
        int index = 1;
        while (index < arr.length) {
            if (min > arr[index]) {
                min = arr[index];
                indexOfMin = index;
            }
            index++;
        }
        arr[indexOfMin] = arr[0];
        arr[0] = min;
    }
}