package com.example.task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task10Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9,5};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==min){
                index=i;
            }
        }
        return index;
    }

}