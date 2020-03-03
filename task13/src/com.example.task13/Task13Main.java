package com.example.task13;

import java.util.Arrays;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 1100, 7, 8, 1005};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null)
            return null;

        int n = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 1000) n++;
        }
        
        int[] numbers = new int[arr.length - n];
        int ind = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < 1000) {
                numbers[ind] = arr[i];
                ind++;
            }
        }
        return numbers;
    }

}