package com.example.task11;

import java.util.Arrays;
import java.util.Collections;

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
        if (arr == null || arr.length == 0) return;
        int tmp = arr[0];
        int minIndex = numMinIndex(arr);
        arr[0] = arr[minIndex];
        arr[minIndex] = tmp;
    }

    static int numMinIndex(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==min){
                index=i;
            }
        }
        return index;
    }
}