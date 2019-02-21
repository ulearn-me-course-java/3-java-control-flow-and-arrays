package com.example.task08;

import java.util.Arrays;

public class Task08Main {
    public static void main(String[] args) {
    }

    static long mult(int[] arr) {
        if(Arrays.equals(arr, null) || arr.length == 0) return 0;
        long multResult = arr[0];
        for (int i = 1; i < arr.length; i++) {
            multResult *= arr[i];
        }
        return multResult;
    }
}
