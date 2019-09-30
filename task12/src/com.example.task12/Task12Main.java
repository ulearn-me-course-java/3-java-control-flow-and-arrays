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
        if (arr == null || arr.length == 0) return;
        for (int start = 0; start < arr.length - 1; start++) {
            int indMin = start;
            for (int i = start + 1; i < arr.length; i++) {
                if (arr[indMin] > arr[i]) {
                    indMin = i;
                }
            }
            int tmp = arr[indMin];
            arr[indMin] = arr[start];
            arr[start] = tmp;
        }
    }

}