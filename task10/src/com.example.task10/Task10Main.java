package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {

        int[] arr = {7, 5, 9, 5};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        int mini = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (mini >= arr[i]) {
                mini = arr[i];
                index = i;
            }
        }
        return index;
    }

}