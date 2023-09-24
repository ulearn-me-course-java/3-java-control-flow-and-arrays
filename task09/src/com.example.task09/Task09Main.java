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
        int min = arr[0];
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i+1] < min)
                min = arr[i+1];
        return min;
    }

}