package com.example.task09;

public class Task09Main {
    public static void main(String[] args) {

    }

    static int min(int[] arr) {
        if(arr.length == 0) return 0;

        int tmpmin = arr[0];
        for(int e: arr) {
            if(e < tmpmin) tmpmin = e;
        }

        return tmpmin;
    }
}