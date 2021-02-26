package com.example.task13;

import java.util.Arrays;

public class Task13Main {
    public static void main(String[] args) {

    }

    static int[] removeMoreThen1000(int[] arr) {
        return arr==null ? null : Arrays.stream(arr).filter(x->x<1000).toArray();
    }

}