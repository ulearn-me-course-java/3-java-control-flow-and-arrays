package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {}

    static int numMin(int[] arr) {
        if (arr == null || arr.length == 0)
        {
            return 0;
        }
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] <= arr[minIndex])
            {
                minIndex = i;
            }
        }
        return minIndex;
    }
}