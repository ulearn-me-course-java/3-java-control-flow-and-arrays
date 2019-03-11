package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {

    }

    static int getMax(int a, int b, int c, int d) {
        if ((a >= b) && (a >= c) && (a >= d))
            return a;
        else
            if ((b >= a) && (b >= c) && (b >= d))
                return b;
            else
                if ((c >= a) && (c >= b) && (c >= d))
                    return c;
                else
                    return d;
    }

}