package com.example.task10;

import java.util.Arrays;
import java.util.OptionalInt;

public class Task10Main {
    public static void main(String[] args) {
        int[] arr = {0,0,0};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        int minimal = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= minimal) {
                minimal = arr[i];
                index = i;
            }
        }
        return index;
    }

}