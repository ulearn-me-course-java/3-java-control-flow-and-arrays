package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
    }

    static long mult(int[] arr) {
        if (arr.length > 0) {
            long mult = 1;
            for (int elem: arr) {
                mult *= elem;
            }
            return mult;
        }
        return 0;
    }
}