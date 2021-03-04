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
        if (arr == null || arr.length == 0) return;

        for (int i = 0; i < arr.length - 1; i++)
            swapWithMin(arr, i);
    }

    static void swapWithMin(int[] arr, int startIndex) {
        int minIndex = numMin(arr, startIndex);
        int first = arr[startIndex];
        arr[startIndex] = arr[minIndex];
        arr[minIndex] = first;
    }

    static int numMin(int[] arr, int startIndex) {
        int min = arr[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}