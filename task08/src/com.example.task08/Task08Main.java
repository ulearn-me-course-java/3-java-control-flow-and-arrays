package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {

        int[] arr = new int[2];
        arr[0] = 8_000_000;
        arr[1] = 9_000_000;
        System.out.println(mult(arr));
    }

    static long mult(int[] arr) {
        long mult = 1;
        if (arr.length == 0) {
            return 0;
        }
        else{
            for(int i = 0; i < arr.length; i++) {
                 mult *= arr[i];
            }
            return mult;
        }
    }

}