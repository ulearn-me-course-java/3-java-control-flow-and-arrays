package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 1100, 7, 8};
        int[] newArr = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(newArr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0)
            return arr;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1000) {
                count++;
            }
        }

        int[] result = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1000) {
                result[j] = arr[i];
                j++;
            }
        }

        return result;
    }

}