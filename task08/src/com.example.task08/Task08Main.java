package com.example.task08;

public class Task08Main {
    static long mult(int[] arr) {
        if (arr.length == 0) return 0;
        long mul = 1;
        for (int el : arr)
            mul *= el;
        return mul;
    }

}