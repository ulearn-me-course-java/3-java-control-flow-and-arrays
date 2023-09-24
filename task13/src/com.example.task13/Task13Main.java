package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {

        int[] arr = {9, 1100, 1001, 999, 7, 8};
        int[] newArr = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(newArr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        int count = 0;

        for(int i = 0; i <arr.length; i++) {
            if (arr[i] < 1000) {
                count++;
            }
        }

        int[] newArr = new int[count];
        int j = 0;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < 1000) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return  newArr;
    }

}