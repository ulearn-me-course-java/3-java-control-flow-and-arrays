package com.example.task13;

import java.util.ArrayList;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 1100, 7, 8};
        int[] arr1 = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr1));
    }

    static int[] removeMoreThen1000(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей

        if(arr == null || arr.length == 0) return arr;

        int count = 0;
        for (int item : arr)
            if(item <= 1000)
                count++;

        int[] res = new int[count];
        count = 0;
        for (int item : arr)
            if(item <= 1000)
                res[count++] = item;

        return res;
    }
}