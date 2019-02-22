package com.example.task11;
import java.util.Arrays;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = { 7, 5, 9 };
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        if (Arrays.equals(arr, null) || arr.length == 0) return;
        int[] values = {0, Integer.MAX_VALUE, arr[0]};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] <= values[1]) {
                values[1] = arr[i];
                values[0] = i;
            }
        arr[0] = values[1];
        arr[values[0]] = values[2];
    }
}