package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {

        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        System.out.println(mult(arr));
    }

    static long mult(int[] arr) {

        long m = 1;
        if (arr.length == 0) return 0;
        else{
            for (int i = 0; i < arr.length; i++){
                m *= arr[i];
            }
        }
        return m;
    }

}