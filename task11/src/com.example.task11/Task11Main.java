package com.example.task11;

import java.util.stream.IntStream;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        if (arr != null && arr.length > 0)
            swap(arr, 0, minIndex(arr));
    }

    static void swap(int[] arr, int first_idx, int second_idx) {
        int temp = arr[first_idx];
        arr[first_idx] = arr[second_idx];
        arr[second_idx] = temp;
    }

    static int minIndex(int[] arr) {
        return IntStream
                .range(0, arr.length)
                .reduce((i, j) -> arr[i] < arr[j] ? i : j)
                .orElse(0);
    }
}