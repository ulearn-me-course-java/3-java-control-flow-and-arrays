package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 1100, 7, 8};
        System.out.println(java.util.Arrays.toString(removeMoreThen1000(arr)));
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr != null && arr.length > 0) {
            int lengthNewArr = 0;
            for (int item : arr)
                if (item <= 1000)
                    lengthNewArr++;
            int[] newArr = new int[lengthNewArr];
            int index = 0;
            for (int item : arr)
                if (item <= 1000)
                    newArr[index++] = item;
            return newArr;
        }
        else return arr;
    }

}