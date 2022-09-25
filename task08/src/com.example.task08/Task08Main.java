package com.example.task08;

import java.util.Scanner;

public class Task08Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int len = in.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Произведение элементов массива: " + mult(arr));
    }

    static long mult(int[] arr) {
        if (arr.length == 0){
            return 0;
        }

        int mult_arr = 0;
        for (int el_arr : arr) {
            mult_arr *= el_arr;
        }
        return mult_arr;
    }

}