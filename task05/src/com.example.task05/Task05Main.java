package com.example.task05;

import java.util.Arrays;
import java.util.Collections;

public class Task05Main {
    public static void main(String[] args) {
        System.out.println(getMin(1,2,3));
    }

    static int getMin(int a, int b, int c) {
        return Collections.min(Arrays.asList(a,b,c));
    }
}