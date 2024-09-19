package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {

        System.out.println(getMin(5, 4, 3));
    }

    static int getMin(int a, int b, int c) {
        int[] nums = new int[]{a, b, c};
        int min = a;
        for (int i = 1; i < 3; i++) {
            min = Math.min(min, nums[i]);
        }
        return min;
    }
}