package com.example.task07;

import java.util.Arrays;

public class Task07Main {
    public static void main(String[] args) {
    }

    static int sum(int[] arr) {
        if(Arrays.equals(arr, null) || arr.length == 0) return 0;
        int sum = 0;
        for (int elem : arr) {
            sum += elem;
        }
        return sum;
    }
}
