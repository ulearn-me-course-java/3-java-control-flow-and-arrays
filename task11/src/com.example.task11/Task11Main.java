package com.example.task11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {7, 5, 9, 0, 5, -1};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if(arr == null || arr.length == 0) return;

        int min = Integer.MAX_VALUE, index = 0;
        for (int i = 0; i < arr.length; i++)
            if(min >= arr[i])
            {
                min = arr[i]; index = i;
            }

        arr[index] = arr[0];
        arr[0] = min;
    }
}