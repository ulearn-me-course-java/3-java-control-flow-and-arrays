package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
    }

    static int getMin(int a, int b, int c) {
        int min;
        if (a < b)
            min = a;
        else
            min = b;
        if (min > c)
            min = c;
        return min;
    }
}