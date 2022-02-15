package com.example.task09;

import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.stream.*;

public class Task09Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = -1;
        arr[2] = 3;
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        OptionalInt min = Arrays.stream(arr).min();
        return min.getAsInt();
    }

}