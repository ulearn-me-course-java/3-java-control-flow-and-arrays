package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
    }

    static int getMax(int a, int b, int c, int d) {
        if (b > a) a = b;
        if (c > a) a = c;
        if(d > a) a = d;
        return a;
    }

}