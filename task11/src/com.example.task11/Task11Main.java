package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        Tests tests = new Tests();
        tests.testSwap();
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0)
        {
            return;
        }

        int minValue = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (minValue >= arr[i]) {
                minValue = arr[i];
                index = i;
            }
        }

        int tempValue = arr[0];
        arr[0] = arr[index];
        arr[index] = tempValue;
    }

}