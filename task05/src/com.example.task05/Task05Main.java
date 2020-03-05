package com.example.task05;

import java.util.stream.IntStream;

public class Task05Main {
    public static void main(String[] args) {
        System.out.println(getMin(5,4,3));
    }

    static int getMin(int a, int b, int c) {
        return IntStream.of(a, b, c).min().getAsInt();
    }
}