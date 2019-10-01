package com.example.task12;

import java.util.Arrays;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = {9, 11, 7, 8, 3, 12};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if (arr != null && arr.length != 0) {
            for (int i = 0; i < arr.length; ++i) {
                swap(arr, i);
            }
        }
    }

    static void swap(int[] arr, int n) {
        int i = numMin(arr, n), tmp = arr[n];
        arr[n] = arr[i];
        arr[i] = tmp;
    }

    static int numMin(int[] arr, int n) {
        int result = n;
        for (int i = n; i < arr.length; i++)
            if (arr[result] >= arr[i])
                result = i;
        return result;
    }
}