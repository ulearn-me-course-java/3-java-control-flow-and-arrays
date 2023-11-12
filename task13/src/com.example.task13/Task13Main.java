package com.example.task13;

public class Task13Main {

    public static void main(String[] args) {
        int[] arr = {};
        int[] newArr = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(newArr));
    }

    static int getArrLength(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i < 1001) {
                count++;
            }
        }
        return count;
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0)
            return arr;
        int[] less1001Arr = new int[getArrLength(arr)];
        int indexLess1001ArrCounter = 0;
        for (int i : arr) {
            if (i <= 1000) {
                less1001Arr[indexLess1001ArrCounter] = i;
                indexLess1001ArrCounter++;
            }
        }
        return less1001Arr;
    }
}