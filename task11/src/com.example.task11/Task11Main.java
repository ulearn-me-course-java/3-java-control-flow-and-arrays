package com.example.task11;

import java.util.Arrays;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        if (arr == null)
            System.out.println("если пришедший массив null, то ничего делать не нужно");
        else if (arr.length == 0)
            System.out.println("если пришедший массив пуст, то ничего делать не нужно");
        else {
            int i = numMin(arr), tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
        }
    }

    static int numMin(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[result] >= arr[i])
                result = i;
        return result;
    }
}