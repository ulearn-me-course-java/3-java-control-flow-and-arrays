package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        int[] arr = new int[0];
        System.out.println(mult(arr));
    }

    static long mult(int[] arr) {
        long result = arr.length == 0 ? 0 : 1;
        for (int i = 0; i < arr.length; i++) {
            result *= arr[i];
        }

        return result;
    }

}