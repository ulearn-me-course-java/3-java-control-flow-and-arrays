package com.example.task13;
import java.util.Arrays;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = { 9, 1100, 7, 8 };
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int dropCount(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > 1000)
                counter++;
        return counter;
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (Arrays.equals(arr, null) || arr.length == 0) return arr;
        int index = 0;
        int[] array = new int[arr.length - dropCount(arr)];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] <= 1000) {
                array[index] = arr[i];
                index++;
            }
        return array;
    }
}