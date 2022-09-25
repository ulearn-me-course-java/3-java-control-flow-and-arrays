package com.example.task12;

import static java.util.Objects.isNull;

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
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        int min;
        int iMin;
        if(isNull(arr) || arr.length == 0)
            return;

        for (int i = 0; i < arr.length; i++){
            min = Integer.MAX_VALUE;
            iMin = i;
            for (int j = i; j < arr.length; j++){
                if (min>arr[j]) {
                    min = arr[j];
                    iMin = j;
                }
            }
            arr[iMin] = arr[i];
            arr[i] = min;
        }
    }

}