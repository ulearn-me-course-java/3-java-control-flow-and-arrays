package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
    }

    static int numMin(int[] arr) {
        int minElem = Integer.MAX_VALUE;
        int minElemIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= minElem) {
                minElem = arr[i];
                minElemIndex = i;
            }
        }
        return minElemIndex;
    }
}