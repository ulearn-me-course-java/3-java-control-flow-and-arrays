package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr != null && arr.length > 0) {
            int newLength = 0;
            for (int item : arr) {
                if (item <= 1000) newLength++;
            }
            int[] newArr = new int[newLength];
            int index = 0;
            for (int item : arr) {
                if (item <= 1000) newArr[index++] = item;
            }
            return newArr;
        } else return arr;
    }
}