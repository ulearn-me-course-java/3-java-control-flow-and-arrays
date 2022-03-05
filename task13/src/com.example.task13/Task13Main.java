package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 1100, 7, 8};
        System.out.println(java.util.Arrays.toString(removeMoreThen1000(arr)));
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr != null) {
            int wrongNumbersCount = 0;
            for (int number : arr)
                if (number > 1000)
                    wrongNumbersCount++;

            int[] result = new int[arr.length - wrongNumbersCount];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (arr[i] > 1000)
                    continue;
                else
                    result[j] = arr[i];

                j++;
            }

            return result;
        }

        return null;
    }

}