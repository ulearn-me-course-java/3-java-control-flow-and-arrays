package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {

    }

    static void swap(int[] arr) {
        if(arr == null || arr.length == 0) return;

        int tmpmin = arr[0];
        int indx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < tmpmin) {
                tmpmin = arr[i];
                indx = i;
            }
        }

        arr[indx] = arr[0];
        arr[0] = tmpmin;
    }
}