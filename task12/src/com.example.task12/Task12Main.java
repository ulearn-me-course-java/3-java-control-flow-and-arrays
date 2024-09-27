package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {

        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        if(!(arr == null || arr.length == 0)) {
            for (int j = 0; j < arr.length; j++) {
                for (int i = j + 1; i < arr.length; i++) {
                    if (arr[i] <= arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }

}