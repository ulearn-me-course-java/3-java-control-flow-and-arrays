package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        System.out.println(getMin(4,5,6));
    }

    static int getMin(int a, int b, int c) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        return min;
    }
}