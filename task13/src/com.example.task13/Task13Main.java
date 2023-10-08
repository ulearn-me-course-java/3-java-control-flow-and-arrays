package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {

        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0){
            return arr;
        }

        int finalLenght = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1000) {
                finalLenght++;
            }
        }

        int[] res = new int[finalLenght];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1000) {
                res[j] = arr[i];
                j++;
            }
        }

        return res;
    }

}