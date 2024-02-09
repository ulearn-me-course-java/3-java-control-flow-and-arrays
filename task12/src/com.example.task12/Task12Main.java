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

        for (int i = 0; i < arr.length; i++) {
            swap(i, arr);
        }
    }

    static void swap(int elemIdx, int[] arr) {
        int minIdx = numMin(elemIdx, arr);
        int temp = arr[elemIdx];
        arr[elemIdx] = arr[minIdx];
        arr[minIdx] = temp;
    }

    static int numMin(int idx, int[] arr) {
        int min = arr[idx];
        int minIdx = idx;

        for (int i = idx; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                minIdx = i;
            }
        }

        return minIdx;
    }

}