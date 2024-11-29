package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {

        System.out.println(getMax(1, 2, 3, 4));

    }

    static int getMax(int a, int b, int c, int d) {
        int max = a;

        max = (b > max ? b : max);

        max = (c > max ? c : max);

        max = (d > max ? d : max);

        return max;
    }

}