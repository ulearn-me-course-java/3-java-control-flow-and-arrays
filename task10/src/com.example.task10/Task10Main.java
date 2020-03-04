package com.example.task10;

import java.util.Arrays;

public class Task10Main {
    public static void main(String[] args) {
    }

    static int numMin(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);
        int result = -1;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == clone[0]) result = i;
        return result;
    }

}