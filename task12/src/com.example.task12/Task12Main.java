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
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        int min = arr[0];
        int minInd = 0;

        for (int i = 1; i < arr.length; i++) {

            if (min >= arr[i]) {
                min = arr[i];
                minInd = i;
            }

        }

        for(int t = 0; t < arr.length;t++)
        {
            int first = arr[0];
            arr[0] = arr[minInd];
            arr[minInd] = first;
        }
    }

}