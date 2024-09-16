package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {

    }

    static int getMax(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        int max = arr[0];
        for (int i = 1 ; i < arr.length ; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

}