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
    static void swap(int[] arr, int firstIndex, int secondIndex) {
        if (firstIndex == secondIndex)
            return;
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
    static void selectionSort(int[] arr) {
        if (arr == null) return;
        if(arr.length == 0) return;
        for (int partIndex = 0; partIndex < arr.length; partIndex++){
            int minIndex = partIndex;
            for (int i = partIndex; i < arr.length; i++) {
                if (arr[minIndex] > arr[i]) {
                    minIndex = i;
                }
            }
            swap(arr, partIndex, minIndex);
        }
    }

}