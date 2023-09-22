package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0) return arr;
        int newArrLength = 0;
        for (int elem: arr) {
            if (elem <= 1000) newArrLength++;
        }

        int[] newArr = new int[newArrLength];
        int curArrLength = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1000) {
                newArr[arr.length - curArrLength] = arr[i];
                curArrLength--;
            }
        }

        return newArr;
    }
}