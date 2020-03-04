package com.example.task13;

import java.util.ArrayList;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null)
            return null;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int x : arr) {
            if (x < 1000)
                list.add(x);
        }
        int[] result = new int[list.size()];
        int count = 0;
        for (int x : list) {
            result[count++] = x;
        }
        return result;
    }
}
