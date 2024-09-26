package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        ///*
        int[] arr = {7, 5, 9, 11, 13, 3};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
         //*/
    }

    static void swap(int[] arr) {

        if (arr == null || arr.length == 0) return;

        int minIndex = 0;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] < arr[minIndex]) minIndex = index;
        }

        int temp = arr[0];
        arr[0] = arr[minIndex];
        arr[minIndex] = temp;
    }

}