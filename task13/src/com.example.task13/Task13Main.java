package com.example.task13;

import java.util.Arrays;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(Arrays.toString(removeMoreThen1000(arr)));
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null){
            return null;
        }

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