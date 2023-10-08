package com.example.task05;

public class Task05Main {
    public static void main(String[] args)
    {
        System.out.println(getMin(228,27,10));
    }

    static int getMin(int a, int b, int c)
    {
        if (a < c && a < b)
        {
            return a;
        }
        else if (b < c && b < a)
        {
            return b;
        }
        return c;
    }
}