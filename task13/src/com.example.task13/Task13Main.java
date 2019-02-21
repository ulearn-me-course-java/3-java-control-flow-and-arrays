package com.example.task13;

import java.util.Arrays;

public class Task13Main {
    public static void main(String[] args) {
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (Arrays.equals(arr, null) || arr.length == 0) return arr;
        int countMore1000 = getCountMore1000(arr);
        int[] resArr = new int[arr.length - countMore1000];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] <= 1000)
                resArr[j++] = arr[i];
        }
        return resArr;
    }

    private static int getCountMore1000(int[] arr) {
        int countMore1000 = 0;
        for (int elem : arr) {
            if (elem > 1000) {
                countMore1000++;
            }
        }
        return countMore1000;
    }
}
