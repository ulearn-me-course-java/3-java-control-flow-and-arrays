package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 5};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        int minArr = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= minArr) {
                minArr = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

}