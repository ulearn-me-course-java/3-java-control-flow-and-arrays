package com.example.task10;

import java.util.Scanner;

public class Task10Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int len = in.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Номер минимального элемента массива: " + numMin(arr));
    }

    static int numMin(int[] arr) {
        int min = arr[0], num = 0;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                num = i;
            }
        }

        return num + 1;
    }

}