package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {

        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static int[] removeMoreThen1000(int[] arr) {
        int more1000 = 0;
        if (arr == null)
            return null;
        for (int x : arr){
            if (x >= 1000)
                more1000++;
        }

        int[] massOut = new int[arr.length - more1000];
        int i = 0;
        for (int x : arr){
            if (x < 1000)
                massOut[i++] = x;
        }
        return massOut;
    }


}