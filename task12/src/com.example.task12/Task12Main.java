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
        if (arr == null || arr.length == 0)
            return;

        boolean swapped = false;
        int minI = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] <= arr[i - 1]) {
                    minI = i;
                    swapped = true;
                }
            }

            if (swapped) {
                swap(arr, j, minI);
                swapped = false;
            }
        }
    }

    static void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}