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
        if (arr == null || arr.length == 0) return;
        int min;
        int minNum;
        int tmp;
        for (int i = 0; i < arr.length; i++){
            min = arr[i];
            minNum = i;
            for (int p = i+1;p < arr.length; p++){
                if (arr[p] < min){
                    min = arr[p];
                    minNum = p;
                }
            }
            arr[minNum] = arr[i];
            arr[i] = min;
        }
    }

}