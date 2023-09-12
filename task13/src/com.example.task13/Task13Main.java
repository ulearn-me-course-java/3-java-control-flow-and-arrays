package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 1100, 7, 8};
        arr = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0)
        {
            return arr;
        }

        int bigValueNumber = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > 1000)
            {
                bigValueNumber++;
            }
        }

        int[] result = new int[arr.length - bigValueNumber];

        int i = 0;
        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] <= 1000)
            {
                result[i] = arr[j];
                i++;
            }
        }

        return result;
    }

}