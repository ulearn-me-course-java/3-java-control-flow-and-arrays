package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {

        int[] arr = new int[0];
        System.out.println(mult(arr));

    }

    static long mult(int[] arr) {
        long result = 1;
        int index = 0;
        if (arr.length==0){
            return 0;
        }
        while(index < arr.length) {
            result *= arr[index];
            index++;
        }
        return result;
    }

}