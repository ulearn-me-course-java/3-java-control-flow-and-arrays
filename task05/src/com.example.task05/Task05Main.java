package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMin(5,4,3));
         */
    }

    static int getMin(int a, int b, int c) {
        /*int min = a > b ? b : a;
        if (min > c) min = c;
        return min;*/
        return Math.min(a,Math.min(b,c));
    }
}