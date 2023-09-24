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
        if (arr != null) {
            int count = 0;
            for (int i : arr) {
                if (i <= 1000) {
                    count += 1;
                }
            }
            int[] newArr = new int[count];
            int idx = 0;
            for (int i : arr) {
                if (i <= 1000) {
                    newArr[idx] = i;
                    idx += 1;
                }
            }
            return newArr;
        } else {
            return null;
        }
    }
}