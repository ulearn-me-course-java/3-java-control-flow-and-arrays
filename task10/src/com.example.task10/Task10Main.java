package com.example.task10;

import java.util.Arrays;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
         */
    }

    static int numMin(int[] arr) {
        int index = 0;
        int[] copy = Arrays.copyOf(arr,arr.length);
        Arrays.sort(copy);
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == copy[0]) {
                index = i;
            }
        }
        return index;
    }
}