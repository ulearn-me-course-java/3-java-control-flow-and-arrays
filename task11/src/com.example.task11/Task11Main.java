package com.example.task11;

import java.lang.reflect.Array;

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
        if (arr != null) {
            int size = arr.length;
            if (size != 0) {
                int min = arr[0];
                int count = 0;
                for (int i = 1; i < size; i++) {
                    if (arr[i] <= min) {
                        min = arr[i];
                        count = i;
                    }
                }
                arr[count] = arr[0];
                arr[0] = min;
            }
        }
    }

}