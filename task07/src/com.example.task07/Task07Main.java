package com.example.task07;

public class Task07Main {
    public static void main(String[] args) {
        int[] myArray = new int[4];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        System.out.println(sum(myArray));
    }

    static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;

    }

}