package com.example.task12;

import javax.naming.InsufficientResourcesException;

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

        if (arr == null) return;
        if(arr.length == 0) return;

        for (int i = 0; i < arr.length; i++){
            int min = arr[i];
            for (int j = i; j < arr.length; j++){
                min = Math.min(min, arr[j]);
            }

            int index = -1;

            for (int c = 0; c < arr.length; c++){
                if (arr[c] == min)
                    index = c;
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        }



        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
}

