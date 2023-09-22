package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
    }

    static int getMin(int a, int b, int c) {
        if (a > b)
            if (b > c) return c;
            else return b;
        else
            if (a > c) return c;
            else return a;
    }
}