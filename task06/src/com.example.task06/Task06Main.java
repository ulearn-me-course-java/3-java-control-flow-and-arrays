package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {

    }

    static int getMax(int a, int b, int c, int d) {
        int maxAB = (a > b) ? a : b;
        int maxCD = (c > d) ? c : d;

        return (maxAB > maxCD) ? maxAB : maxCD;
    }
}