package com.example.task13;

import java.util.ArrayList;

public class Task13Main {
    public static void main(String[] args) {
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null || arr.length == 0) return arr;
        ArrayList<Integer> list = new ArrayList<>();
        for (int e : arr)
            if (e <= 1000) list.add(e);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            result[i] = list.get(i);
        return result;
    }

}