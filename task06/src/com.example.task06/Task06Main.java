package com.example.task06;

import java.util.Scanner;

public class Task06Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("a = ");
        int a = in.nextInt();

        System.out.print("b = ");
        int b = in.nextInt();

        System.out.print("c = ");
        int c = in.nextInt();

        System.out.print("d = ");
        int d = in.nextInt();

        System.out.print(getMax(a, b, c, d));
    }

    static int getMax(int a, int b, int c, int d) {
        int max_f = Math.max(a, b);
        int max_s = Math.max(c,d);
        return Math.max(max_s, max_f);
    }

}