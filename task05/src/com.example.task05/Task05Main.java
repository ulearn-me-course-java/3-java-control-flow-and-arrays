package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        System.out.println(getMin(9,8,7));

    }

    static int getMin(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < c && b < a ) {
            return b;
        }
        else return c;
    }
}