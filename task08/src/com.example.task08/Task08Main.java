package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {

        int[] arr = new int[4];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 5;
        arr[3] = 2;
        System.out.println(mult(arr));

    }

    static long mult(int[] arr) {
        if(arr.length == 0)
            return 0;

        long product = 1;

        for(int i = 0; i < arr.length; i++)
            product *= arr[i];

            return product;
    }

}