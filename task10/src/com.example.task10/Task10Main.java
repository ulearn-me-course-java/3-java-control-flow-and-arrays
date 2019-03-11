package com.example.task10;

import java.util.Arrays;

public class Task10Main {
    public static void main(String[] args) {

    }

    static int numMin(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt(),
            i = 0;
        for (i = arr.length-1; min != arr[i]; i--);
        return i;
    }

}