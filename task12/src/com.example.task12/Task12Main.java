package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr == null || arr.length == 0) return;
        for (int i = 0; i < arr.length; i++){
            swap(arr, i);
        }
    }
    static int numMin(int[] arr, int index) {
        int min = arr[index];
        for (int i = index; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
    static void swap(int[] arr, int index) {
        int minIndex = numMin(arr, index);

        int value = arr[index];
        arr[index] = arr[minIndex];
        arr[minIndex] = value;
    }
}