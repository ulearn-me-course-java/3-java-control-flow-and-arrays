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

        if (arr == null){
            return;
        }

        for (int c = 0; c < arr.length; c++) {
            int res = c;
            for (int i = res; i < arr.length; i++) {
                if (arr[res] >= arr[i]) {
                    res = i;
                }
            }
            int a = arr[c];
            arr[c] = arr[res];
            arr[res] = a;
        }
    }
}