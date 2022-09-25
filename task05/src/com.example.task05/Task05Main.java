package com.example.task05;

import java.util.Scanner;

public class Task05Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("a = ");
        int a = in.nextInt();

        System.out.print("b = ");
        int b = in.nextInt();

        System.out.print("c = ");
        int c = in.nextInt();

        System.out.print(getMin(a, b, c));
    }

    static int getMin(int a, int b, int c) {
        int min = Math.min(a, b);
        min = Math.min(min,c);
        return min;
    }
}