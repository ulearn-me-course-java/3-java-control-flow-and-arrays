package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {

        int indexMinNum = -1;
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < minNum) {

                minNum = arr[i];
                indexMinNum = i;

            }
        }
        arr[indexMinNum] = arr[0];
        arr[0] = minNum;
    }
}