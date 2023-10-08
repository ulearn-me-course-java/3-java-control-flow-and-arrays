package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 5;
        arr[1] = 12;
        System.out.println(mult(arr));
    }

    static long mult(int[] arr) {
        int mul = 1;
        for(int i : arr){
            mul *= i;
        }
        return mul;
    }

}