package com.example.task13;

import java.util.Arrays;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 1100, 7, 8};
        int[] newArr = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(newArr));

    }

    static int[] removeMoreThen1000(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        int arrSize =0 ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= 1000){
                arrSize++;
            }
        }
        int[] newArr = new int[arrSize];
        int j = 0;
        for (int i : arr) {
            if (i <= 1000) newArr[j++] = i;
        }
        return newArr;
    }

}