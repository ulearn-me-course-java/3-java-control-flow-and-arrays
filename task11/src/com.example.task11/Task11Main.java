package com.example.task11;

import java.lang.reflect.Array;
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
        if (arr == null){
            return;
        }
        if (arr.length > 0){
            int idx = 0;
            int m = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= m) {
                    m = arr[i];
                    idx = i;
                }
            }
            int v = arr[0];
            arr[0] = arr[idx];
            arr[idx] = v;
        }
    }

}