package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {

    }

    static void selectionSort(int[] arr) {
        if ((arr != null) && (arr.length != 0)) {
            for (int k = 0; k < arr.length; k++) {
                int index = 0;
                int min = Integer.MAX_VALUE;
                for (int i = k; i < arr.length; i++) {
                    if (arr[i] <= min) {
                        min = arr[i];
                        index = i;
                    }
                }
                int first = arr[k];
                arr[index] = first;
                arr[k] = min;
            }
        }
    }

}