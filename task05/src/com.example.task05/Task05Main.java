package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {

    }

    static int getMin(int a, int b, int c) {
        if ((a <= b) && (a <= c))
            return a;
        else
            if ((b <= a) && (b <= c))
                return b;
            else
                return c;
    }
}