package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 3;
        System.out.println(mult(arr));
         */
    }

    static long mult(int[] arr) {
        long product = 1;
        if (arr.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < arr.length; i++) {
                product *= arr[i];
            }
            return product;
        }
    }

}