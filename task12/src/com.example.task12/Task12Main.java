package com.example.task12;

import java.util.Scanner;

public class Task12Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int len = in.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }

        selectionSort(arr);
    }

    static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i], num = 0;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    num = j;
                }
            }
            if (min != arr[i]) {
                arr[num] = arr[i];
                arr[i] = min;
            }
        }

        System.out.println("Новый массив: ");

        for (int el_arr : arr) {
            System.out.println(el_arr);
        }    }

}