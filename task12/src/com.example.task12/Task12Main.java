package com.example.task12;
import java.util.Arrays;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int getMinIndex(int[] array, int iteration) {
        int index = 0;
        int min = Integer.MAX_VALUE;
        for (int i = iteration; i < array.length; i++)
            if (array[i] <= min) {
                min = array[i];
                index = i;
            }
        return index;
    }

    static void swap(int[] arr, int index, int i) {
        int temp = arr[index];
        arr[index] = arr[i];
        arr[i] = temp;
    }

    static void selectionSort(int[] arr) {
        if (Arrays.equals(arr, null) || arr.length == 0) return;
        for (int i = 0; i < arr.length; i++) {
            int minIndex = getMinIndex(arr, i);
            swap(arr, minIndex, i);
        }
    }
}