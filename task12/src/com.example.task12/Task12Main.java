package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {8, -10, 5, -3, 1000, 0};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if (arr == null){
            return;
        }
        for (int k = 0; k < arr.length; k++) {
            int min = k;
            for (int i = k; i < arr.length; i++) {
                if (arr[min] >= arr[i]) {
                    min = i;
                }
            }
            int interim = arr[k];
            arr[k] = arr[min];
            arr[min] = interim;
        }
    }
}