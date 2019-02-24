package com.example.task13;

import java.util.Arrays;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (Arrays.equals(arr, null) || Arrays.equals(arr, new int[]{}))
            return arr;
        int count = getCount(arr);
        int[] sortArr = new int[arr.length - count];
        int i = 0;
        for (int x : arr) {
            if (x < 1001) {
                sortArr[i] = x;
                i++;
            }
        }
        return sortArr;
    }

    private static int getCount(int[] arr) {
        int count = 0;
        for (int e : arr)
            if (e > 1000)
                count++;
        return count;
    }

}