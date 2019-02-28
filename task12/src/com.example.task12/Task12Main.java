package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void selectionSort(int[] arr) {
        if (arr != null && arr.length > 0 ) {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0)
                    minSwap(i, arr);
                else
                    maxSwap(i, arr);
            }
        }
    }

    static void minSwap(int start, int[] arr) {
            int min = arr[start];
            int minIndex = start;
            for (int i = start; i < arr.length; i++)
                if (arr[i] <= min) {
                    min = arr[i];
                    minIndex = i;
                }
            int a = arr[minIndex];
            arr[minIndex] = arr[start];
            arr[start] = a;
    }

    static void maxSwap(int start, int[] arr) {
            int max = arr[start];
            int maxIndex = start;
            for (int i = start; i < arr.length; i++)
                if (arr[i] <= max) {
                    max = arr[i];
                    maxIndex = i;
                }
            int a = arr[maxIndex];
            arr[maxIndex] = arr[start];
            arr[start] = a;
    }
}