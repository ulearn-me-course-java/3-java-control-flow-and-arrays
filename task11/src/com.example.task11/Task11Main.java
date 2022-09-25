package com.example.task11;

import java.util.Scanner;

public class Task11Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int len = in.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }

        swap(arr);
    }

    static void swap(int[] arr) {
        int min = arr[0], num = 0;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                num = i;
            }
        }

        int a = arr[0];
        arr[0] = arr[num];
        arr[num] = a;

        System.out.println("Новый массив: ");

        for (int el_arr : arr) {
            System.out.println(el_arr);
        }
    }

}