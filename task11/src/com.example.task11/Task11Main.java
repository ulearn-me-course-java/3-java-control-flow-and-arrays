package com.example.task11;

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

        if ((arr == null) || (arr.length == 0)) {
            return;
        }
        int min = arr[0];
        int numMin = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (min >= arr[i + 1]) {
                numMin = i + 1;
                min = arr[i + 1];
            }
        }
        int swap = arr[0];
        arr[0] = arr[numMin];
        arr[numMin] = swap;
        }
    }