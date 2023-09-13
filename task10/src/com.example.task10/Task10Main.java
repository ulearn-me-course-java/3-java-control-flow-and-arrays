package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        int minEl = arr[0];
        int minElInd = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= minEl) {
                minEl = arr[i];
                minElInd = i;
            }
        }

        return minElInd;
    }

}