package com.example.task09;
import java.util.Arrays;

public class Task09Main {
    public static void main(String[] args) {
        int[] arr = { 2, -1, 3 };
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }
}