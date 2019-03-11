package com.example.task11;

import java.util.Arrays;

public class Task11Main {
    public static void main(String[] args) {

    }

    static void swap(int[] arr) {
        if (arr == null)
            return;
        if (arr.length < 2)
            return;

        int min = Arrays.stream(arr).min().getAsInt(),
            i = 0;
        for (i = 0; arr[i] != min; i++);
        arr[i] = arr[0];
        arr[0] = min;
    }

}