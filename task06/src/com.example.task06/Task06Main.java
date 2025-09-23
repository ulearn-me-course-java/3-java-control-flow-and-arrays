package com.example.task06;

import java.util.Arrays;
import java.util.Collection;

public class Task06Main {
    public static void main(String[] args) {

        System.out.println(getMax(1, 2, 3, 4));

    }

    static int getMax(int a, int b, int c, int d) {
        int[] nums = {a, b, c, d};
        int maxInt = Arrays.stream(nums).max().getAsInt();
        return maxInt;
    }

}