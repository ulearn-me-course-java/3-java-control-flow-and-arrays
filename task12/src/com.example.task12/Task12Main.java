package com.example.task12;

import java.util.Arrays;

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
        if (arr != null && arr.length>0){
            for(int j = 0; j < arr.length-1; j++)
            {
                int first = arr[j];
                int min = Arrays.stream(Arrays.copyOfRange(arr, j, arr.length)).min().getAsInt();
                for (int i = j; i < arr.length; i++) {
                    if (arr[i] == min) {
                        arr[i] = first;
                    }
                }
                arr[j] = min;
            }
        }


    }

}