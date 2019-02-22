package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        int[] arr = { 2, 3 };
        System.out.println(mult(arr));
    }

    static long mult(int[] arr) {
        if (arr.length == 0)
            return 0;

        double multiply = 1.0d;
        for (int i = 0; i < arr.length; i++)
            multiply *= arr[i];
        return (long)multiply;
    }
}