package com.example.task13;

import java.util.Arrays;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 1100, 7, 8};
        System.out.println(java.util.Arrays.toString(removeMoreThen1000(arr)));
    }

    static int[] removeMoreThen1000(int[] arr) {
        return arr == null ? null : Arrays.stream(arr).filter(value -> value < 1000).toArray();
    }

}