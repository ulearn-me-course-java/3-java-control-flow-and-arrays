package com.example.task06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task06Main {
    public static void main(String[] args) {
    }

    static int getMax(int a, int b, int c, int d) {
        Integer[] arr = new Integer[]{a,b,c,d};
        return Arrays.stream(arr).max(Integer::compare).get();
    }

}