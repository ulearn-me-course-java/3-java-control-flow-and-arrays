package com.example.task05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task05Main {
    public static void main(String[] args) {

        System.out.println(getMin());

    }
    static int getMin(int... numbers) {
        if (numbers.length < 1)
            throw new IllegalArgumentException();
        return Arrays.stream(numbers).min().getAsInt();
    }
    //Math.min(a,Math.min(b,c)) если вдруг прям очень нужно из трех
}