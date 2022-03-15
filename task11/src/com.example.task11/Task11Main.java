package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = {7, 5, 9, 1, 4, 4, 1};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        if (arr != null && arr.length != 0) {
            int minValue = arr[0];
            int minIndex = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < minValue) {
                    minValue = arr[i];
                    minIndex = i;
                }
            }
            arr[minIndex] = arr[0];
            arr[0] = minValue;
        }

    }

}