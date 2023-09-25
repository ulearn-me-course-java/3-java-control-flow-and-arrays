package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        Tests tests = new Tests();
        tests.testMin();
    }

    static int numMin(int[] arr) {
        int minValue = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (minValue >= arr[i]) {
                minValue = arr[i];
                index = i;
            }
        }
        return index;
    }

}