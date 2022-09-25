package com.example.task07;

import java.util.Scanner;

public class Task07Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i =0; i < 5; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Сумма элементов массива: " + sum(arr));
    }

    static int sum(int[] arr) {
        int sum_arr = 0;
        for (int el_arr : arr) {
            sum_arr += el_arr;
        }
        return sum_arr;
    }

}