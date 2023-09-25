package com.example.task09;

public class Task09Main {
    public static void main(String[] args) {
        Tests tests = new Tests();
        tests.testMin();
    }

    static int min(int[] arr) {
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (result > arr[i]) {
                result = arr[i];
            }
        }
        return result;
    }

}