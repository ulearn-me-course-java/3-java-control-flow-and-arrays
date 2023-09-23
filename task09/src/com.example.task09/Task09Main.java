package com.example.task09;

import java.lang.reflect.Array;

public class Task09Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = -1;
        arr[2] = 3;
        System.out.println(min(arr));
         */
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int ar : arr){
            if(ar < min){
                min = ar;
            }
        }
        return min;
    }

}