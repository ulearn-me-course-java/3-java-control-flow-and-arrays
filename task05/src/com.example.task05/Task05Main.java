package com.example.task05;
public class Task05Main {
    public static void main(String[] args) {

        System.out.println(getMin(58,87,12));

    }

    static int getMin(int a, int b, int c) {

        return Math.min(Math.min(a,b), Math.min(b,c));

    }
}