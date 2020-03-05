package com.example.task13;

import java.util.stream.IntStream;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        return arr == null || arr.length == 0
                ? arr
                : IntStream
                    .of(arr)
                    .filter(it -> it < 1000)
                    .toArray();
    }
}