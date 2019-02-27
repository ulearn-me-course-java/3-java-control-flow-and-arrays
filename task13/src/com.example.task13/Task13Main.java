package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {

        int[] arr = {9, 1100, 7, 8};

        System.out.println(java.util.Arrays.toString(removeMoreThen1000(arr)));

    }

    static int[] removeMoreThen1000(int[] arr) {

        if (arr == null)
            return null;
        if (arr.length == 0)
            return arr;
        int j = 0;
        for (int el : arr)
            if (el <= 1000)
                j++;
        int[] newArr = new int[j];
        j = 0;
        for (int el :arr)
            if (el <= 1000) {
                newArr[j] = el;
                j++;
            }
        return newArr;
    }

}