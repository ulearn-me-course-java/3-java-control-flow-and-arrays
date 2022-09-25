package com.example.task09;

public class Task09Main {
    public static void main(String[] args) {
    }

    static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < min) min = i;
        }
        return min;
    }
}