package com.example.task08;

import java.util.Arrays;

public class Task08Main {
    public static void main(String[] args) {
    }

    static long mult(int[] arr) {
        long mul = arr.length == 0 ? 0 : 1;
        for (int i : arr) {
            mul *= i;
        }
        return mul;
    }

}