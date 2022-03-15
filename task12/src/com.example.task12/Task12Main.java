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
        if (arr != null){
            for (int i = 0; i < arr.length; i++){
                swap(arr, i);
            }
        }
    }
    static void swap(int[] arr, int index) {
        if (arr != null && arr.length > 0) {
            int numOfMin = numMin(arr, index);
            int temp = arr[index];
            arr[index] = arr[numOfMin];
            arr[numOfMin] = temp;
        }
    }
    static int numMin(int[] arr, int index) {
        int numOfMin = index;
        int minNum = arr[index];
        for(int i = index; i < arr.length; i++){
            if (arr[i] < minNum) {
                minNum = arr[i];
                numOfMin = i;
            }
        }

        return numOfMin;
    }
}