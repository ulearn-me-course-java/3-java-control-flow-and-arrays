package com.example.task11;

import java.util.Arrays;

public class Task11Main {
    public static void main(String[] args) {
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int[] clone = arr.clone();
        Arrays.sort(clone);
        int index = -1;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == clone[0]) index = i;
        int temp = arr[0];
        arr[0] = clone[0];
        arr[index] = temp;
    }

}