package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {

        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr) {

        if (arr == null)
            return null;
        int length = 0;
        for (int value : arr)
            if (value <= 1000)
                length++;
        int[] result = new int[length];
        int i = 0;
        for (int value : arr)
            if (value <= 1000)
            {
                result[i] = value;
                i++;
            }
        return result;
    }
}