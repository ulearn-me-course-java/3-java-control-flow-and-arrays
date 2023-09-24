package com.example.task09;

public class Task09Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = -1;
        arr[2] = 3;
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int minArr = arr[0];
        for (int i : arr) {
            if (i < minArr) {
                minArr = i;
            }
        }
        return minArr;
    }

}