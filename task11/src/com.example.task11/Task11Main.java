package com.example.task11;

import java.util.Arrays;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void swap(int[] arr) {
        if (Arrays.equals(arr, null) || Arrays.equals(arr, new int[]{}))
            return;
        int minIndex = getMinIndex(arr);
        int t = arr[0];
        arr[0] = arr[minIndex];
        arr[minIndex] = t;
    }

    private static int getMinIndex(int[] arr) {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] <= min) {
                min = arr[i];
                minIndex = i;
            }
        return minIndex;
    }


}