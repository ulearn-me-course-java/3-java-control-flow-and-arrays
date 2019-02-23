package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {

    }

    static long mult(int[] arr) {
        if(arr.length == 0) return 0;

        long comp = 1;
        for(int e: arr)
            comp *= e;

        return comp;
    }
}