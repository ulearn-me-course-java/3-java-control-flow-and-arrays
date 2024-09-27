package com.example.task13;

import java.util.ArrayList;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 1100, 7, 8};
        System.out.println(java.util.Arrays.toString(removeMoreThen1000(arr)));
    }

    static int[] removeMoreThen1000(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i = 0; i<arr.length; i++)
            if (arr[i]<1000)
                newArr.add(arr[i]);
        int[] finalArr = new int[newArr.size()];
        for (int i = 0; i< newArr.size();i++)
            finalArr[i] = newArr.get(i);
        return finalArr;
    }
}