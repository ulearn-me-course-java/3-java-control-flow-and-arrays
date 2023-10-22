package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        System.out.println(getMin(3,4,2));
    }

    static int getMin(int a, int b, int c) {
        if(a <= b && b <= c){
            return a;
        } else if (b <= a && a <= c) {
            return b;
        }
        else {
            return c;
        }
    }
}