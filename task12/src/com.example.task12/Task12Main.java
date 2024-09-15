package com.example.task12;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }
    public static void swap(int[] arr,int i, int minInd){
        int n = arr[minInd];
        arr[minInd] = arr[i];
        arr[i] = n;
    }

    static void selectionSort(int[] arr) {
        if (arr != null && arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                int minInd = i;
                for (int k = i; k < arr.length; k++) {
                    if (arr[k] < arr[minInd]) {
                        minInd = k;
                    }
                }
                swap(arr,i,minInd);
            }
        }
    }
}