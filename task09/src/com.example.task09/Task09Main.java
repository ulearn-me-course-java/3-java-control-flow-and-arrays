package com.example.task09;

import java.util.Arrays;

public class Task09Main {
    public static void main(String[] args) {
    }

    static int min(int[] arr) {
        if(Arrays.equals(arr, null) || arr.length == 0) return 0;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i])
                min = arr[i];
        }
        return min;
    }
}
