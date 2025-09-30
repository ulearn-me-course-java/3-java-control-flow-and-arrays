package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 3, 12, 1, 66, 2, 46};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        if (arr.length == 0 || arr == null){
            return;
        }
        int min = arr[1];
        int minIndx = 1;

        for (int i = 2; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
                minIndx = i;
            }
        }

        arr[minIndx] = arr[0];
        arr[0] = min;
    }

}