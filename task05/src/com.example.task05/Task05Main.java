package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {

        System.out.println(getMin(5,4,3));

    }

    static int getMin(int a, int b, int c) {
        int min = 0;
        if(a < b){
            min = a;
        }
        else if(b < c){
            min = b;
        }
        else min = c;

        return min;
    }
}