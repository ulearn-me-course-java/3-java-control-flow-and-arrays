package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
    }

    static int numMin(int[] arr) {
        int indexMin = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] <= min) {
                indexMin = i;
                min = arr[i];
            }
        return indexMin;
    }

}