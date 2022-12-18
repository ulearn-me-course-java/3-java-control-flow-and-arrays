package com.example.task13;

import java.util.Arrays;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 1100, 7, 8};
        arr = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) return arr;
        int countOfNumbers = 0;
        for (int elem : arr) if (elem <= 1000) countOfNumbers++;
        int[] result = new int[countOfNumbers];
        int i = 0;
        for (int elem : arr) {
            if (elem <= 1000) {
                result[i] = elem;
                i++;
            }
        }
        return result;
    }

}