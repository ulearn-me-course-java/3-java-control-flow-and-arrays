package com.example.task13;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = {9, 1100, 7, 8};
        int[] arr2 = removeMoreThen1000(arr);
        System.out.println(Arrays.toString(arr2));
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null)
            return null;
        if (arr.length == 0)
            return arr;
        int countMoreThen1000 = 0;
        for (int i : arr)
            if (i <= 1000)
                countMoreThen1000++;
        int[] result= new int[countMoreThen1000];
        for (int i = 0, j = 0; i < arr.length && j < result.length; i++) {
            if (arr[i] <= 1000) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }
}