package com.example.task11;

import java.util.Arrays;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = null;
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0){
            return;
        }
        int minNumIndex = getMinNumIndex(arr);
        int temp = arr[0];

        arr[0] = arr[minNumIndex];
        arr[minNumIndex] = temp;
    }

    static int getMinNumIndex(int[] arr) {
        int min = arr[0];
        int minIndex = 0, count = 0;
        for (int num : arr){
            if (num <= min){
                min = num;
                minIndex = count;
            }
            count++;
        }
        return minIndex;
    }
}