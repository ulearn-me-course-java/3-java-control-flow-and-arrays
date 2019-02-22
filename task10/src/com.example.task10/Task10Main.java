package com.example.task10;
import java.util.Arrays;

public class Task10Main {
    public static void main(String[] args) {
        int[] arr = { 7, 5, 9 };
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        int[] values = { 0, Integer.MAX_VALUE };
        for (int i = 0; i < arr.length; i++)
            if (arr[i] <= values[1]) {
                values[1] = arr[i];
                values[0] = i;
            }
        return values[0];
    }
}