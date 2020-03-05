package com.example.task08;

import java.util.Arrays;

public class Task08Main {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 3;
        System.out.println(mult(arr));
    }

    static long mult(int[] arr) {
        return Arrays
                .stream(arr)
                .mapToObj(it -> (long) it)
                .reduce((a, b) -> a * b)
                .orElse(0L);
    }
}