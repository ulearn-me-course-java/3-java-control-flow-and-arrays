package com.example.task09;

public class Task09Main {
    public static void main(String[] args) {
        int[] arr = new int[1];
        arr[0] = 2147483647;
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (result > arr[i]) {
                result = arr[i];
            }
        }
        return result;
    }

}