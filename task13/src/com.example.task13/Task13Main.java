package com.example.task13;

import java.util.Scanner;

public class Task13Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int len = in.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }

        int[] new_arr = removeMoreThen1000(arr);

        System.out.println("Новый массив: " );

        System.out.println(java.util.Arrays.toString(new_arr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        int[] new_arr = new int[countNumBiggerThen1000(arr)]; int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (1000 > arr[i]) {
                new_arr[j] = arr[i];
                j++;
            }
        }
        return new_arr;
    }

    static int countNumBiggerThen1000(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (1000 > arr[i]) {
                count++;
            }
        }
        return count;
    }

}