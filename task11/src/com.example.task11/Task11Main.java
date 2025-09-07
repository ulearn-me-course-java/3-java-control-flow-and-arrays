package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {71234, 125, 2};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующейint
        int min = Integer.MAX_VALUE;
        int index = 0;
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                index = i;
            }
        }
        arr[0] = arr[index];
        arr[index] = temp;


    }

}