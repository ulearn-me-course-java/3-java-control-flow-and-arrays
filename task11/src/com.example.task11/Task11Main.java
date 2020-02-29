package com.example.task11;

import java.util.stream.IntStream;

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

    static int numMin(int[] arr) {
        return IntStream.range(0, arr.length)
                .reduce((i, j) -> arr[i] >= arr[j] ? j : i)
                .getAsInt();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void swap(int[] arr) {
        if (arr==null||arr.length == 0)
            return;
        int min = numMin(arr);
        swap(arr, 0, min);
    }

}