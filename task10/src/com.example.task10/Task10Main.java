package com.example.task10;

import java.util.Arrays;

public class Task10Main {
    public static void main(String[] args) {
    }

    static int numMin(int[] arr) {
        int minIndex = -1;
        if (Arrays.equals(arr, null) || arr.length == 0) return minIndex;
        for (int i = 0, min = Integer.MAX_VALUE; i < arr.length; i++) {
            if (arr[i] <= min) {
                minIndex = i;
                min = arr[i];
            }
        }
        return minIndex;
    }
}
