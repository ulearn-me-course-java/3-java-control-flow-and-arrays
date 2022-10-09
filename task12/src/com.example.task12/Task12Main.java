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
        if (arr == null || arr.length == 0)
            return;
        int min = Integer.MAX_VALUE;
        int count = 0;
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min = Integer.MAX_VALUE;
            for (int i1 = i; i1 < arr.length; i1++) {
                if (min >= arr[i1]) {
                    min = arr[i1];
                    count = i1;
                }
            }
            temp = arr[i];
            arr[i] = arr[count];
            arr[count] = temp;
        }
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
    }

}