package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if (arr == null) return;
        for (int x = 0; x < arr.length - 1; x++) {
            int minNum = x;
            int min = arr[minNum];
            for (int i = x + 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    minNum = i;
                }
            }
            if (minNum == x) continue;
            arr[minNum] = arr[x];
            arr[x] = min;
        }
    }

}