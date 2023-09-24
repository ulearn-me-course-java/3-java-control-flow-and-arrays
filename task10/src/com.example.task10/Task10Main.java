package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        int min = arr[0];
        int numbermin = 0;
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i+1] < min) {
                min = arr[i+1];
                numbermin = i+1;
            }
        return numbermin;
    }

}