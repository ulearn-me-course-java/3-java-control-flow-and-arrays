package com.example.task08;

import java.util.Arrays;

public class Task08Main {
    public static void main(String[] args) {

    }

    static long mult(int[] arr) {
        if (arr.length == 0)
            return 0;

        long res = 1;
        for (int a: arr)
            res *= a;
        return res;
    }

}