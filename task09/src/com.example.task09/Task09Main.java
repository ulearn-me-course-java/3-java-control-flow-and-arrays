package com.example.task09;

public class Task09Main {
    public static void main(String[] args) {
        /*
        int[] arr = new int[3];
        arr[0] = 123123;
        arr[1] = 3213213;
        arr[2] = 121312;
        System.out.println(min(arr));
        */
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int num: arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

}