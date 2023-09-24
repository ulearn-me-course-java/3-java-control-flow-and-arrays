package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 1100, 7, 8};
        int[] result = removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(result));
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) {
            return null;
        } else if (arr.length == 0) {
            return arr;
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 1000)
                count += 1;
        }
        int[] newArr;
        newArr = new int[count];

        int numberNewArr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 1000) {
                newArr[numberNewArr] = arr[i];
                numberNewArr++;
            }
        }

        return  newArr;
    }

}