package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {

        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) return;

        int numMin = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; ++i){
            if (minValue >= arr[i]){
                minValue = arr[i];
                numMin = i;
            }
        }
        int temp = arr[0];
        arr[0] = minValue;
        arr[numMin] = temp;
    }

}