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
        if (arr != null && arr.length != 0) {
            int k = 0;
            while (k < arr.length-1) {
                int min = k;
                int num = arr[k];
                for (int i = k+1; i < arr.length; i++) {
                    if (arr[min] > arr[i]) {
                        min = i;
                    }
                }
                arr[k] = arr[min];
                arr[min] = num;
                k++;
            }
        }
    }

}