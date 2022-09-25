package com.example.task09;

import java.util.Scanner;

public class Task09Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int len = in.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Минимальный элемент массива: " + min(arr));
    }

    static int min(int[] arr) {
        int min = arr[0];

        for (int el_arr : arr) {
            if(min > el_arr){
                min = el_arr;
            }
        }

        return min;
    }

}