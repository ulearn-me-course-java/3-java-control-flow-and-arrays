package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {

        int[] arr = {9, 1100, 7, 8};
        arr = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr1) {
        int count = 0;
        for (int num : arr1) if (num <= 1000) count++;
        int[] arr = new int[count];
        for (int i = 0, j = 0; i < arr1.length; i++) if (arr1[i] <= 1000) arr[j++] = arr1[i];
        return arr;
    }

}