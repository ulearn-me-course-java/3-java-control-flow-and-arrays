package com.example.task07;

public class Task07Main {
    public static void main(String[] args) {
        int[] myArray = { 2, 10, 10, 0 };
        System.out.println(sum(myArray));
    }

    static int sum(int[] arr) {
        int amount = 0;
        for (int i = 0; i < arr.length; i++)
            amount += arr[i];
        return amount;
    }
}