package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
         */
    }

    static int numMin(int[] arr) {
        int size = arr.length;
        if (size == 0) return -1;
        int min = arr[0];
        int count = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                count = i;
            }
        }
        return count;
    }

}