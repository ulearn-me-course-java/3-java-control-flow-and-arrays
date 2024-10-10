package com.example.task13;

import java.util.Arrays;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) return null;
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 1000){
                count++;
            }
        }
        int[] New_array = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 1000){
                New_array[i-j] = arr[i];
            }
            else {
                j++;
            }
        }
        return  New_array;
    }
}