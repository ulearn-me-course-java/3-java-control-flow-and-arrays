package com.example.task11;

import java.util.Arrays;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {5, 4, 5, 5};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if (arr != null && arr.length>0){
            int first = arr[0];
            int min = Arrays.stream(arr).min().getAsInt();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == min) {
                    arr[i] = first;
                }
            }
            arr[0] = min;
        }
    }

}