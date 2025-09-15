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

        if (arr == null)
            return;

        if (arr.length != 0) {

            for (int i = 0; i < arr.length; i++) {

                int minNumber = Integer.MAX_VALUE;
                int indexMinNum = i;
                for (int j = i; j < arr.length; j++) {

                    if (arr[j] < minNumber) {

                        minNumber = arr[j];
                        indexMinNum = j;

                    }
                }
                arr[indexMinNum] = arr[i];
                arr[i] = minNumber;
            }
        }
    }
}