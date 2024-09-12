package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 1100, 7, 8};
        int[] newArr = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(newArr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0){
            return  arr;
        }
        int normalNumbers = 0;
        for (int el : arr) {
            if (el < 1000) {
                normalNumbers++;
            }
        }
        int[] newArr = new int[normalNumbers];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] > 1000) {
                continue;
            }
            else {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }

}