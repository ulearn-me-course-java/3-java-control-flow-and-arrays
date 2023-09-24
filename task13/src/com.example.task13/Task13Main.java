package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 100000, 7, 12345, -12345, 8};
        int[] ints = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(ints));
    }

    static int[] removeMoreThen1000(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i <= 1000) {
                count++;
            }
        }
        int[] resultArr = new int[count];
        int index = 0;
        for (int j : arr) {
            if (j <= 1000) {
                resultArr[index] = j;
                index++;
            }
        }
        return resultArr;
    }
}