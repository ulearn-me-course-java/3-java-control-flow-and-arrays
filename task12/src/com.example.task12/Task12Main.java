package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
    }

    static void selectionSort(int[] arr) {
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                int indexMin = 0;
                int min = Integer.MAX_VALUE;
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] < min) {
                        indexMin = j;
                        min = arr[j];
                    }
                }
                arr[indexMin] = arr[i];
                arr[i] = min;
            }
        }
    }
}