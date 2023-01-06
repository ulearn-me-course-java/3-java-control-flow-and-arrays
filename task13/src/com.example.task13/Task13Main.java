package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) {
            return null;
        }
        int count = countLessThen1000(arr);
        int[] newArr = new int[count];

        int curElem = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1000) {
                newArr[curElem] = arr[i];
                curElem++;
            }
        }
        return newArr;
    }

    static int countLessThen1000(int[] arr){
        int count = 0;
        for (int num : arr) {
            if (num <= 1000) {
                count++;
            }
        }
        return count;
    }
}