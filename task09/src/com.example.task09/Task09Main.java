package com.example.task09;

public class Task09Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = -1;
        arr[2] = 3;
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        int minum = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < minum)
                minum = arr[i];
        }
        return minum;
    }

}