package com.example.task06;

import java.sql.Array;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMax(1, 2, 3, 4));
         */
    }

    static int getMax(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        int max = Integer.MIN_VALUE;
        for (int x : arr)
            if (x > max)
                max = x;
        return max;
    }

}