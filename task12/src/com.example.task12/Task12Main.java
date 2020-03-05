package com.example.task12;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if (arr != null && arr.length > 0)
            IntStream
                    .range(0, arr.length)
                    .forEach(idx -> swap(arr, idx, indexOfMin(arr, idx)));
    }

    static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    static int indexOfMin(int[] array, int from) {
        return IntStream
                .range(from, array.length)
                .reduce((i, j) -> array[i] < array[j] ? i : j)
                .getAsInt();
    }
}