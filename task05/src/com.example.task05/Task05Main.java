package com.example.task05;

import java.util.Arrays;

public class Task05Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMin(5,4,3));
         */
    }

    static int getMin(int a, int b, int c) {
        int min = Integer.MAX_VALUE;
        for (int i : new int[] {a, b, c}){
            min = Math.min(min, i);
        }
        return min;
    }
}