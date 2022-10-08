package com.example.task06;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getMax(1, 2, 3, 4));
         */
    }

    static int getMax(int a, int b, int c, int d) {
        int[] age = {a, b, c, d};

        int max = age[0];
        for (int i = 1; i < age.length; i++) max = Math.max(max, age[i]);
        return max;
    }

}