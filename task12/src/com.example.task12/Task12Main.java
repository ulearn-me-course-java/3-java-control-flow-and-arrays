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

        if(arr != null && arr.length > 0){
            for(int i = 0; i < arr.length; i++){
                swap(arr, i);
            }
        }
    }

    static void swap(int[] arr, int first) {

        int minIndex = numMin(arr, first);
        int tempMin = arr[minIndex];

        arr[minIndex] = arr[first];
        arr[first] = tempMin;
    }

    static int numMin(int[] arr, int begin) {

        int minIndex = begin;
        int min = arr[begin];
        for(int i = begin; i < arr.length; i++){
            if(arr[i] <= min){
                min = arr[i];
                minIndex = i;
            }
        }

        return minIndex;
    }
}