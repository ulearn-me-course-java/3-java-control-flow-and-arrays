package com.example.task08;

public class Task08Main {
    public static void main(String[] args) {
        int[] arr = new int[0];
        //arr[0] = 0;
        //arr[1] = 3;
        System.out.println(mult(arr));
    }

    static long mult(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        long multip = 1;
        if (arr.length == 0)
            System.out.println("произведение пустого массива = 0");
        else {
            for (int i = 0; i < arr.length; i++) {
                multip *= arr[i];
            }
        }
        return multip;
    }

}