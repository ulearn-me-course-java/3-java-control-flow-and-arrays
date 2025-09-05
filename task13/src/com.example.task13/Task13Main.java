package com.example.task13;

import java.lang.reflect.Array;

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
        if (arr == null || arr.length == 0) return arr;
        int counter = 0;
        for (int i : arr) {
            if (i < 1000) counter += 1;
        }
        int[] newArr = new int[counter];
        int index = 0;
        for (int i : arr) {
            if (i < 1000) {
                newArr[index++] = i;
            }
        }
        return newArr;
    }
}